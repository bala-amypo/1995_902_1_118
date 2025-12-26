package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "supplier_risk_alert")
public class SupplierRiskAlert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(nullable = false)
    private Long supplierId;

    @NotBlank
    @Column(nullable = false)
    private String alertLevel;

    @Column(nullable = false)
    private Boolean resolved = false;

    // ---------- GETTERS & SETTERS ----------

    public Long getId() {
        return id;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public String getAlertLevel() {
        return alertLevel;
    }

    public Boolean getResolved() {
        return resolved;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public void setAlertLevel(String alertLevel) {
        this.alertLevel = alertLevel;
    }

    public void setResolved(Boolean resolved) {
        this.resolved = resolved;
    }
}
