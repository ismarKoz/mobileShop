package com.itakademija.mobileshop.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Transactional
@Data
public class Cart {
    @Id
    @GeneratedValue
    @Column(name = "cart_id")
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "cart_id")
    private List<OrderEntry> orderEntry;

    private DeliveryType deliveryType;
    private Integer totalPrice;
    private Integer numberOfItems;
}
