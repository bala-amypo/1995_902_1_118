package com.example.demo.service;

import com.example.demo.model.DelayScoreRecord;

public interface DelayScoreService {
    DelayScoreRecord compute(Long poId);
}
