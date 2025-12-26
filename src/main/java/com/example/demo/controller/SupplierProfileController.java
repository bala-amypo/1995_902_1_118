package com.example.demo.controller;

import com.example.demo.repository.SupplierProfileRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SupplierProfileController {

    private final SupplierProfileRepository supplierProfileRepository;

    public SupplierProfileController(SupplierProfileRepository supplierProfileRepository) {
        this.supplierProfileRepository = supplierProfileRepository;
    }
}
