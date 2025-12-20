package com.example.demo.service;

import com.example.demo.model.*;
import com.example.demo.repository.*;
import org.springframework.stereotype.Service;

import java.time.temporal.ChronoUnit;

@Service
public class DelayScoreServiceImpl implements DelayScoreService {

    private final PurchaseOrderRecordRepository poRepo;
    private final DeliveryRecordRepository deliveryRepo;
    private final DelayScoreRecordRepository delayRepo;

    public DelayScoreServiceImpl(PurchaseOrderRecordRepository poRepo,
                                 DeliveryRecordRepository deliveryRepo,
                                 DelayScoreRecordRepository delayRepo) {
        this.poRepo = poRepo;
        this.deliveryRepo = deliveryRepo;
        this.delayRepo = delayRepo;
    }

    @Override
    public DelayScoreRecord compute(Long poId) {

        PurchaseOrderRecord po = poRepo.findById(poId).orElseThrow();
        DeliveryRecord d = deliveryRepo.findByPoId(poId).get(0);

        long days = ChronoUnit.DAYS.between(
                po.getPromisedDeliveryDate(),
                d.getActualDeliveryDate());

        DelayScoreRecord r = new DelayScoreRecord();
        r.setPoId(poId);
        r.setSupplierId(po.getSupplierId());
        r.setDelayDays((int) days);
        r.setDelaySeverity(days <= 0 ? "ON_TIME" : "DELAYED");

        return delayRepo.save(r);
    }
}
