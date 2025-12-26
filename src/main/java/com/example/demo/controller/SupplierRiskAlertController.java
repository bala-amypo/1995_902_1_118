package com.example.demo.controller;

import com.example.demo.entity.SupplierRiskAlert;
import com.example.demo.repository.SupplierRiskAlertRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/risk-alerts")
public class SupplierRiskAlertController {

    private final SupplierRiskAlertRepository repository;

    public SupplierRiskAlertController(SupplierRiskAlertRepository repository) {
        this.repository = repository;
    }

    // CREATE RISK ALERT
    @PostMapping
    public ResponseEntity<SupplierRiskAlert> createAlert(
            @RequestBody SupplierRiskAlert alert) {

        SupplierRiskAlert saved = repository.save(alert);
        return ResponseEntity.ok(saved);
    }

    // GET ALL RISK ALERTS
    @GetMapping
    public ResponseEntity<List<SupplierRiskAlert>> getAllAlerts() {
        return ResponseEntity.ok(repository.findAll());
    }

    // GET ALERT BY ID
    @GetMapping("/{id}")
    public ResponseEntity<SupplierRiskAlert> getAlertById(
            @PathVariable Long id) {

        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
