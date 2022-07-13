package com.itakademija.mobileshop.repository;

import com.itakademija.mobileshop.model.Cart;
import com.itakademija.mobileshop.model.DeliveryType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
  //  List<Cart> findCartByDeliveryTypeAndTotalPrice(DeliveryType dt, Integer price);
}
