package com.example.demo.service.Impl;

import com.example.demo.service.DelayScoreService;
import org.springframework.stereotype.Service;

@Service
public class DelayScoreServiceImpl implements DelayScoreService {

    @Override
    public int compute(Long poId) {
        // Dummy logic (replace later)
        return 5;
    }
}
