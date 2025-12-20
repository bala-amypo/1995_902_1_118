package com.example.demo.service.Impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.PurchaseOrderService;

@Service
public class PurchaseOrderServiceImpl implements PurchaseOrderService {

    @Override
    public String createPurchaseOrder() {
        return "Purchase order created";
    }
}
