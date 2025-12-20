package com.example.demo.service;

import com.example.demo.entity.SupplierProfile;
import java.util.List;

public interface SupplierProfileService {

    SupplierProfile save(SupplierProfile profile);

    List<SupplierProfile> findAll();
}
