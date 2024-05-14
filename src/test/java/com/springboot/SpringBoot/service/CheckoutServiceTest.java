package com.springboot.SpringBoot.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(SpringExtension.class)
class CheckoutServiceTest {

    @Autowired
    CheckoutService checkoutService;

    @TestConfiguration
    static class CheckoutConfig {
        @Bean
        public CheckoutService checkoutService() {
            return new CheckoutService();
        }
    }

    @Test
    public void getCheckoutInfo(){
        double finalAmt = checkoutService.calculateCheckoutInfo(99.99, 9.99);
        Assertions.assertEquals(102.6,finalAmt);


    }

}