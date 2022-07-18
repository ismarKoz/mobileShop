package com.itakademija.mobileshop.controller;

import com.itakademija.mobileshop.service.CartService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartController {

  private final CartService cartService;

  public CartController(CartService cartService) {
    this.cartService = cartService;
  }

  @GetMapping("/cart")
  public String showCart(){
    return "cart";
  }



//    @PutMapping("/cart/{id}/orderEntry")
//    Cart addOrderEntryToCart(@RequestBody OrderEntry orderEntry, @PathVariable Long id) {
//
//    }

}
