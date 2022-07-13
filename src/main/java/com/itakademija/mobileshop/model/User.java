package com.itakademija.mobileshop.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data

@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Long id;
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String email;
    private Date dateOfBirth;

    @OneToOne(mappedBy = "user")
    private Cart cart;

    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToOne(mappedBy = "user")
    private Order order;

}
