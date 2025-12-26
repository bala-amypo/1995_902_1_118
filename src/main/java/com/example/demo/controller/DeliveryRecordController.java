package com.example.demo.controller;

import com.example.demo.entity.DeliveryRecord;
import com.example.demo.service.DeliveryRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/delivery-records")
public class DeliveryRecordController {

    @Autowired
    private DeliveryRecordService deliveryRecordService;

    // CREATE delivery record
    @PostMapping
    public ResponseEntity<DeliveryRecord> saveDeliveryRecord(
            @RequestBody DeliveryRecord record) {

        if (record == null) {
            return ResponseEntity.badRequest().build();
        }

        DeliveryRecord saved = deliveryRecordService.save(record);
        return ResponseEntity.ok(saved);
    }

    // GET all delivery records
    @GetMapping
    public ResponseEntity<List<DeliveryRecord>> getAllDeliveryRecords() {
        List<DeliveryRecord> records = deliveryRecordService.getAll();
        return ResponseEntity.ok(records);
    }

    // GET delivery record by ID
    @GetMapping("/{id}")
    public ResponseEntity<DeliveryRecord> getById(@PathVariable Long id) {

        if (id == null || id <= 0) {
            return ResponseEntity.badRequest().build();
        }

        DeliveryRecord record = deliveryRecordService.getById(id);

        if (record == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(record);
    }
}
