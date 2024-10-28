package com.labseq.labseqservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class LabSeqServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabSeqServiceApplication.class, args);
    }

}
