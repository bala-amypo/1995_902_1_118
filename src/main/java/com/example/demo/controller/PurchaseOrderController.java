package com.example.demo.controller;

import com.example.demo.entity.PurchaseOrderRecord;
import com.example.demo.repository.PurchaseOrderRecordRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/purchase-orders")
public class PurchaseOrderController {

    private final PurchaseOrderRecordRepository repository;

    public PurchaseOrderController(PurchaseOrderRecordRepository repository) {
        this.repository = repository;
    }

    // CREATE PURCHASE ORDER
    @PostMapping
    public ResponseEntity<PurchaseOrderRecord> createPurchaseOrder(
            @RequestBody PurchaseOrderRecord purchaseOrderRecord) {

        PurchaseOrderRecord saved = repository.save(purchaseOrderRecord);
        return ResponseEntity.ok(saved);
    }

    // GET ALL PURCHASE ORDERS
    @GetMapping
    public ResponseEntity<List<PurchaseOrderRecord>> getAllPurchaseOrders() {
        return ResponseEntity.ok(repository.findAll());
    }
}
