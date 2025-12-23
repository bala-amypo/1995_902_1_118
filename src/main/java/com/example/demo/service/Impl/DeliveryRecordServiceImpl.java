package com.example.demo.service.impl;

import com.example.demo.entity.DeliveryRecord;
import com.example.demo.repository.DeliveryRecordRepository;
import com.example.demo.service.DeliveryRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryRecordServiceImpl implements DeliveryRecordService {

    @Autowired
    private DeliveryRecordRepository deliveryRecordRepository;

    @Override
    public DeliveryRecord save(DeliveryRecord record) {
        return deliveryRecordRepository.save(record);
    }

    @Override
    public List<DeliveryRecord> getAll() {
        return deliveryRecordRepository.findAll();
    }

    @Override
    public DeliveryRecord getById(Long id) {
        return deliveryRecordRepository.findById(id).orElse(null);
    }
}
