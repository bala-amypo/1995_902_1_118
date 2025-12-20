package com.example.demo.service.Impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.AuthService;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public String login(String username, String password) {
        return "Login successful";
    }
}
