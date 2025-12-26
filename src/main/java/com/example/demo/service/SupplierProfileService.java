// SupplierRiskAlertServiceImpl.java
package com.example.demo.service.Impl;

import com.example.demo.service.SupplierRiskAlertService;
import org.springframework.stereotype.Service;

@Service
public class SupplierRiskAlertServiceImpl implements SupplierRiskAlertService {

    @Override
    public String getAlert() {
        return "NO_RISK"; // Dummy
    }
}
