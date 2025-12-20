package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class DelayScoreRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long supplierId;
    private Long poId;
    private Integer delayDays;
    private String delaySeverity;

    // getters & setters
}
