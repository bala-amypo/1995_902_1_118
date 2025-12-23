package com.example.demo.controller;

import com.example.demo.service.DelayScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/delay-score")
public class DelayScoreController {

    @Autowired
    private DelayScoreService delayScoreService;

    @GetMapping("/{poId}")
    public int calculateDelayScore(@PathVariable Long poId) {
        return delayScoreService.compute(poId);
    }
}
