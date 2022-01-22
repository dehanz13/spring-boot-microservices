package com.danzycode.fraud;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

// job: to perform a check for a particular customer
@Service
@AllArgsConstructor
public class FraudCheckService {

    // storing history for the check that happened
    private final FraudCheckHistoryRepository fraudCheckHistoryRepository;

//    public FraudCheckService(FraudCheckHistoryRepository fraudCheckHistoryRepository) {
//        this.fraudCheckHistoryRepository = fraudCheckHistoryRepository;
//    }

    public boolean isFraudulentCustomer(Integer customerId) {
        fraudCheckHistoryRepository.save(
                FraudCheckHistory.builder()
                        .customerId(customerId)
                        .isFraudster(false)
                        .createdAt(LocalDateTime.now())
                        .build()
        );
        return false;
    }
}
