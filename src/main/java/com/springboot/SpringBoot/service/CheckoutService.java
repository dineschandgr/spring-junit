package com.springboot.SpringBoot.service;

import com.springboot.SpringBoot.model.CartDTO;
import org.springframework.stereotype.Service;

@Service
public class CheckoutService {

    public CartDTO getCheckoutInfo(){

        double itemAmount = 99.99;
        double discount = 9.99;
        double finalTotal = calculateCheckoutInfo(itemAmount, discount);
        CartDTO cartDTO = CartDTO.builder().id(1).amount(itemAmount).discount(discount).totalAmount(finalTotal).build();
        return cartDTO;
    }

    public double calculateCheckoutInfo(double itemAmount, double discount){
         double finalAmount = itemAmount - discount;
         double amtWithGST = finalAmount * ( 0.14);
         return finalAmount + amtWithGST;
    }

}
