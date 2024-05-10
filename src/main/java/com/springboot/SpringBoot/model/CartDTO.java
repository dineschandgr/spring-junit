package com.springboot.SpringBoot.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CartDTO {

    int id;

    double amount;

    double discount;

    double totalAmount;


}
