package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class PurchaseOrderRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long supplierId;
    private LocalDate promisedDeliveryDate;

    // ✅ REQUIRED
    public Long getSupplierId() {
        return supplierId;
    }

    public LocalDate getPromisedDeliveryDate() {
        return promisedDeliveryDate;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public void setPromisedDeliveryDate(LocalDate promisedDeliveryDate) {
        this.promisedDeliveryDate = promisedDeliveryDate;
    }
}
