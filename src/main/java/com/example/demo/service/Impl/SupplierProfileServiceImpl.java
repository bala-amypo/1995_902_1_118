package com.example.demo.service.impl;

import com.example.demo.service.SupplierProfileService;
import org.springframework.stereotype.Service;

@Service
public class SupplierProfileServiceImpl implements SupplierProfileService {

    @Override
    public String getSupplierProfile() {
        // Dummy logic, can replace with real DB call
        return "Supplier profile details";
    }
}
