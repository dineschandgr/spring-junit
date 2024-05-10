package com.springboot.SpringBoot.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
class CalculatorTest {

    @Autowired
    Calculator calculator;

    @TestConfiguration
    static class ClientServiceTestContextConfiguration {
        @Bean
        public Calculator calculator() {
            return new Calculator();
        }
    }

    @Test
    void checkout() {

        int sum = calculator.add(20,10);
        Assertions.assertEquals(30,sum);
    }
}