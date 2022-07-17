package com.itakademija.mobileshop.service;

import com.itakademija.mobileshop.repository.CartRepository;
import org.springframework.stereotype.Service;

@Service
public class CartService {
    private CartRepository cartRepository;


    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }




}
