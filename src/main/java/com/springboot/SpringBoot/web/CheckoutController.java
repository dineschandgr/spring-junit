package com.springboot.SpringBoot.web;

import com.springboot.SpringBoot.model.CartDTO;
import com.springboot.SpringBoot.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("checkout")
public class CheckoutController {

    @Autowired
    private CheckoutService checkoutService;

    @GetMapping("/")
    public CartDTO getCheckoutInfo(Model model) {
        return checkoutService.getCheckoutInfo();
    }



}
