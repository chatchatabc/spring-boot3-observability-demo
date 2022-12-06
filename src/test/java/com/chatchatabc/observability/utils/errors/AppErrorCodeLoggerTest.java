package com.chatchatabc.observability.utils.errors;

import org.junit.jupiter.api.Test;


public class AppErrorCodeLoggerTest {
    private static final AppErrorCodeLogger log = AppErrorCodeLoggerFactory.getLogger(AppErrorCodeLoggerTest.class);

    @Test
    public void testLogging() {
        log.info("APP-100-400", "demo@demo.com");
    }
}
