package com.example.demo.service.Impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.SupplierProfileService;

@Service
public class SupplierProfileServiceImpl implements SupplierProfileService {

    @Override
    public String getSupplierProfile() {
        return "Supplier profile details";
    }
}
