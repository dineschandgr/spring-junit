package com.springboot.SpringBoot.service;


import org.springframework.stereotype.Service;

@Service
public class Calculator {

    public int add(int a, int b){
        int c = a + b;
        return c;
    }

    public int sub(int a, int b){
        int c = a - b;
        return c;
    }
}
