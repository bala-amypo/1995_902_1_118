package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class SupplierProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String supplierCode;
    private String supplierName;
    private Boolean active;
    private LocalDateTime createdAt = LocalDateTime.now();

    // getters & setters
}
