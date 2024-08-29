package com.security.jwt.auth.entities;

import lombok.Data;

@Data
public class JwtRequest {

    private String username;
    private String password;
}
