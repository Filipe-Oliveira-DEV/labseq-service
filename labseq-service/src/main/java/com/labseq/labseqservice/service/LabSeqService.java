package com.labseq.labseqservice.service;


import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class LabSeqService {

    @Cacheable("labSeq")
    public long getLabSeq(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Index must be non-negative");
        }
        return calculateLabSeq(n);
    }

    private long calculateLabSeq(int n) {
        if (n == 0) return 0;  // LabSeq(0) = 0
        if (n == 1) return 1;  // LabSeq(1) = 1
        if (n == 2) return 1;  // LabSeq(2) = 1
        if (n == 3) return 2;  // LabSeq(3) = 2

        long[] cache = new long[n + 1];
        cache[0] = 0;  // LabSeq(0)
        cache[1] = 1;  // LabSeq(1)
        cache[2] = 1;  // LabSeq(2)
        cache[3] = 2;  // LabSeq(3)

        for (int i = 4; i <= n; i++) {
            cache[i] = cache[i - 1] + cache[i - 2];  // Corrected logic for Fibonacci-like calculation
        }
        return cache[n];
    }
}


