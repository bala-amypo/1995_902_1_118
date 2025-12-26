package com.example.demo.repository;

import com.example.demo.entity.DelayScoreRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DelayScoreRecordRepository extends JpaRepository<DelayScoreRecord, Long> {
    List<DelayScoreRecord> findBySupplierId(Long supplierId);
}
