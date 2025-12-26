package com.example.demo.repository;

import com.example.demo.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    // JpaRepository provides:
    // - save()
    // - findById()
    // - findAll()
    // - deleteById()
    // - and many more CRUD methods automatically
}
