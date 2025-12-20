package com.example.demo.service.Impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.SupplierRiskAlertService;

@Service
public class SupplierRiskAlertServiceImpl implements SupplierRiskAlertService {

    @Override
    public String getAlert() {
        return "NO_RISK";
    }
}
