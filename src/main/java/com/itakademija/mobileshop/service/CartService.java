package com.itakademija.mobileshop.service;

import com.itakademija.mobileshop.model.OrderEntry;
import com.itakademija.mobileshop.model.Product;
import com.itakademija.mobileshop.repository.CartRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {
    private CartRepository cartRepository;
//    private final List<OrderEntry> shoppingCartItems = new ArrayList<>();


    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

//    public void showCart(Product product) {
//        cartRepository.
//    }


}
