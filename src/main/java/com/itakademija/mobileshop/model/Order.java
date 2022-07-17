package com.itakademija.mobileshop.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "shop_orders")
public class Order {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;
    @OneToMany
    private List<OrderEntry> orderEntry;
    private DeliveryType deliveryType;
    private Integer totalPrice;
    private Integer numberOfItems;
    private String invoice;
}
