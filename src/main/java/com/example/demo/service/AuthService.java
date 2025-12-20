package com.example.demo.service;

import com.example.demo.entity.AppUser;

public interface AuthService {

    AppUser register(AppUser user);

    String login(String username, String password);
}
