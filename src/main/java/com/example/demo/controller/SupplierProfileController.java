// SupplierProfileServiceImpl.java
package com.example.demo.service.Impl;

import com.example.demo.service.SupplierProfileService;
import org.springframework.stereotype.Service;

@Service
public class SupplierProfileServiceImpl implements SupplierProfileService {

    @Override
    public String getSupplierProfile() {
        return "Supplier profile details"; // Dummy
    }
}
