package com.itakademija.mobileshop.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Currency;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private Currency currency;
    @Enumerated(EnumType.STRING)
    private ProductType productType;
    private Integer quantityInStock;
    private String image;
}
