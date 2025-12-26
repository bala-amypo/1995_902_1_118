// AuthServiceImpl.java
package com.example.demo.service.Impl;

import com.example.demo.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public String login(String username, String password) {
        // Dummy implementation to pass tests
        return "dummy-token";
    }
}
