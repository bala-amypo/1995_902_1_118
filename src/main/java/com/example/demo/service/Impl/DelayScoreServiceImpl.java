package com.example.demo.service.Impl;

import com.example.demo.entity.DeliveryRecord;
import com.example.demo.repository.DeliveryRecordRepository;
import com.example.demo.service.DelayScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DelayScoreServiceImpl implements DelayScoreService {

    @Autowired
    private DeliveryRecordRepository deliveryRepo;

    @Override
    public int calculateDelayScore(Long poId) {

        DeliveryRecord record = deliveryRepo.findByPoId(poId);

        if (record == null) {
            return 0;
        }

        // sample logic
        return 10;
    }
}
