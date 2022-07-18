package com.itakademija.mobileshop.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Data

@Table(name = "users")
public class User implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String firstname;
    @Column(nullable = false)
    private String lastname;

    @Column(unique = true)
    private String email;
//    @Column(nullable = false)
//    private Date dateOfBirth;

    @OneToOne(mappedBy = "user")
    private Cart cart;

    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToOne(mappedBy = "user")
    private Order order;

}
