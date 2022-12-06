package com.chatchatabc.observability.application.web;

import com.chatchatabc.observability.application.common.LoginFailedEvent;
import com.chatchatabc.observability.domain.model.User;
import com.chatchatabc.observability.domain.service.UserService;
import com.chatchatabc.observability.utils.errors.AppErrorCodeLogger;
import com.chatchatabc.observability.utils.errors.AppErrorCodeLoggerFactory;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.observation.Observation;
import io.micrometer.observation.ObservationRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

@RestController
@RequestMapping("/user")
public class UserController {
    private static final AppErrorCodeLogger log = AppErrorCodeLoggerFactory.getLogger(UserController.class);

    @Autowired
    private MeterRegistry registry;
    @Autowired
    private ObservationRegistry observationRegistry;
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    @ResponseBody
    public User login(WebRequest request, @RequestParam String email, @RequestParam String password) {
        User user = userService.findUserByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            user.setPassword(null);
            log.info("APP-100-200");
            return Observation.createNotStarted("user.login.success", this.observationRegistry)
                    .observe(() -> user);
        } else { // login failed
            LoginFailedEvent event = new LoginFailedEvent();
            event.begin();
            event.setEmail(email);
            event.commit();
            registry.counter("user.login.failed").increment();
        }
        return null;
    }
}
