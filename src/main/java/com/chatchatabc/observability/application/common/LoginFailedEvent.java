package com.chatchatabc.observability.application.common;

import jdk.jfr.Event;
import jdk.jfr.Label;
import jdk.jfr.Name;


@Name("com.chatchatabc.observability.application.common.LoginFailedEvent")
@Label("LoginFailedEvent")
public class LoginFailedEvent extends Event {
    private String email;

    public LoginFailedEvent() {
    }

    public LoginFailedEvent(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
