package com.example.demo.controller;

import com.example.demo.entity.DeliveryRecord;
import com.example.demo.service.DeliveryRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/delivery-records")
public class DeliveryRecordController {

    @Autowired
    private DeliveryRecordService deliveryRecordService;

    @PostMapping
    public DeliveryRecord saveDeliveryRecord(@RequestBody DeliveryRecord record) {
        return deliveryRecordService.save(record);
    }

    @GetMapping
    public List<DeliveryRecord> getAllDeliveryRecords() {
        return deliveryRecordService.getAll();
    }

    @GetMapping("/{id}")
    public DeliveryRecord getById(@PathVariable Long id) {
        return deliveryRecordService.getById(id);
    }
}
