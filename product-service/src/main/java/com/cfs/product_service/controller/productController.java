package com.cfs.product_service.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class productController {

    @GetMapping("/place")
    public String placeorder(){
        return "Your order has been placed ";
    }

    @GetMapping("/product/{name}")
    public  String orderwithName(@PathVariable String name ){
        return " hello : "+name+" , your order has beeen placed ";
    }
}
