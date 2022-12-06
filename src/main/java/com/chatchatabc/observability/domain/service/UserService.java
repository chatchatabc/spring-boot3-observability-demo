package com.chatchatabc.observability.domain.service;

import com.chatchatabc.observability.domain.model.User;
import org.jetbrains.annotations.Nullable;

public interface UserService {

    @Nullable
    User findUserByEmail(String email);
}
