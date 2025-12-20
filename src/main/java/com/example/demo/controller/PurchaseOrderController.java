package com.example.demo.controller;

import com.example.demo.model.PurchaseOrderRecord;
import com.example.demo.repository.PurchaseOrderRecordRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/purchase-orders")
public class PurchaseOrderController {

    private final PurchaseOrderRecordRepository repo;

    public PurchaseOrderController(PurchaseOrderRecordRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public PurchaseOrderRecord create(@RequestBody PurchaseOrderRecord po) {
        return repo.save(po);
    }

    @GetMapping
    public List<PurchaseOrderRecord> all() {
        return repo.findAll();
    }
}
