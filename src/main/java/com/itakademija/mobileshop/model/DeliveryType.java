package com.itakademija.mobileshop.model;

public enum DeliveryType {
    SHIPPING("shipping"),
    IN_STORE("inStore");

    private final String name;

     DeliveryType(String name) {
        this.name = name;
    }
}
