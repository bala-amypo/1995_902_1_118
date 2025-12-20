package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class SupplierRiskAlert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long supplierId;
    private String alertLevel;
    private Boolean resolved = false;

    // getters & setters
}
