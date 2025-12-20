package com.example.demo.service.Impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.DeliveryRecordService;

@Service
public class DeliveryRecordServiceImpl implements DeliveryRecordService {

    @Override
    public String getStatus() {
        return "OK";
    }
}
