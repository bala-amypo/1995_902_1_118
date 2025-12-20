package com.example.demo.service;

import com.example.demo.entity.DelayScoreRecord;

public interface DelayScoreService {
    DelayScoreRecord compute(Long poId);
}
