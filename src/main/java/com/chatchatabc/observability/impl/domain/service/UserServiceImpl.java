package com.chatchatabc.observability.impl.domain.service;

import com.chatchatabc.observability.domain.model.User;
import com.chatchatabc.observability.domain.service.UserService;
import io.micrometer.observation.annotation.Observed;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Observed(name = "user.findUserByEmail")
    @Nullable
    @Override
    public User findUserByEmail(String email) {
        User user = new User();
        user.setNick("nick1");
        user.setEmail(email);
        user.setPassword("123456");
        user.setId(1L);
        return user;
    }
}
