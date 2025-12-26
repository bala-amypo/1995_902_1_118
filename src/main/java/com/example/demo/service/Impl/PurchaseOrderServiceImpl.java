// PurchaseOrderServiceImpl.java
package com.example.demo.service.Impl;

import com.example.demo.service.PurchaseOrderService;
import org.springframework.stereotype.Service;

@Service
public class PurchaseOrderServiceImpl implements PurchaseOrderService {

    @Override
    public String createPurchaseOrder() {
        return "Purchase order created"; // Dummy
    }
}
