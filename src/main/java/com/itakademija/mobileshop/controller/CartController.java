package com.itakademija.mobileshop.controller;

import com.itakademija.mobileshop.model.Cart;
import com.itakademija.mobileshop.model.OrderEntry;
import com.itakademija.mobileshop.repository.CartRepository;
import com.itakademija.mobileshop.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CartController {

  private final CartService cartService;

  public CartController(CartService cartService) {
    this.cartService = cartService;
  }

  @GetMapping("/cart")
  public void showCart(){

  }



//    @PutMapping("/cart/{id}/orderEntry")
//    Cart addOrderEntryToCart(@RequestBody OrderEntry orderEntry, @PathVariable Long id) {
//
//    }

}
