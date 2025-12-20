package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class DelayScoreRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long poId;
    private int delayDays;
    private String delaySeverity;

    public void setPoId(Long poId) {
        this.poId = poId;
    }

    public void setDelayDays(int delayDays) {
        this.delayDays = delayDays;
    }

    public void setDelaySeverity(String delaySeverity) {
        this.delaySeverity = delaySeverity;
    }
}
