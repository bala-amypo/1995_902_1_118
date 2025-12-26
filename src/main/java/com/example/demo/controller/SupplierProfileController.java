package com.example.demo.controller;

import com.example.demo.entity.SupplierProfile;
import com.example.demo.repository.SupplierProfileRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/suppliers")
public class SupplierProfileController {

    private final SupplierProfileRepository repository;

    public SupplierProfileController(SupplierProfileRepository repository) {
        this.repository = repository;
    }

    // CREATE SUPPLIER
    @PostMapping
    public ResponseEntity<SupplierProfile> createSupplier(
            @RequestBody SupplierProfile supplierProfile) {

        SupplierProfile saved = repository.save(supplierProfile);
        return ResponseEntity.ok(saved);
    }

    // GET ALL SUPPLIERS
    @GetMapping
    public ResponseEntity<List<SupplierProfile>> getAllSuppliers() {
        return ResponseEntity.ok(repository.findAll());
    }

    // GET SUPPLIER BY ID
    @GetMapping("/{id}")
    public ResponseEntity<SupplierProfile> getSupplierById(
            @PathVariable Long id) {

        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
