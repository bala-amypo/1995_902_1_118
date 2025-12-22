package com.example.demo.controller;

import com.example.demo.entity.DeliveryRecord;
import com.example.demo.repository.DeliveryRecordRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/
api/deliveries")
public class DeliveryRecordController {

    private final DeliveryRecordRepository repo;

    public DeliveryRecordController(DeliveryRecordRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public DeliveryRecord create(@RequestBody DeliveryRecord d) {
        return repo.save(d);
    }

    @GetMapping
    public List<DeliveryRecord> all() {
        return repo.findAll();
    }
}
