package com.itakademija.mobileshop.repository;

import com.itakademija.mobileshop.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
  //  List<Cart> findCartByDeliveryTypeAndTotalPrice(DeliveryType dt, Integer price);
}
