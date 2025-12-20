package com.example.demo.service;

import com.example.demo.entity.PurchaseOrderRecord;
import java.util.List;

public interface PurchaseOrderService {

    PurchaseOrderRecord save(PurchaseOrderRecord record);

    List<PurchaseOrderRecord> findAll();
}
