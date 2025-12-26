package com.example.demo.controller;

import com.example.demo.service.DelayScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/delay-score")
public class DelayScoreController {

    @Autowired
    private DelayScoreService delayScoreService;

    @GetMapping("/{poId}")
    public ResponseEntity<Integer> calculateDelayScore(@PathVariable Long poId) {

        if (poId == null || poId <= 0) {
            return ResponseEntity.badRequest().build();
        }

        int score = delayScoreService.compute(poId);
        return ResponseEntity.ok(score);
    }
}
