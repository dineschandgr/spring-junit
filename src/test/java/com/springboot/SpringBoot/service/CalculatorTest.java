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
    static class CalculatorTestConfig {
        @Bean
        public Calculator calculator() {
            return new Calculator();
        }
    }

    @Test
    void add() {

        int sum = calculator.add(20,10);
        Assertions.assertEquals(30,sum);
    }


    @Test
    void sub() {
        int diff = calculator.sub(20,10);
        Assertions.assertEquals(10,diff);
    }
}