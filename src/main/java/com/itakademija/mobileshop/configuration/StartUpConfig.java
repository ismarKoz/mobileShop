package com.itakademija.mobileshop.configuration;

import com.itakademija.mobileshop.model.Role;
import com.itakademija.mobileshop.model.User;
import com.itakademija.mobileshop.repository.UserRepository;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class StartUpConfig {

    public StartUpConfig(UserRepository userRepository) {
        var testUser = new User();
        testUser.setUsername("miduka-sandzak");
        testUser.setFirstname("Ismar");
        testUser.setLastname("Kozica");
        testUser.setEmail("cikack2021@gmail.com");
        testUser.setPassword("anavolimte");
        testUser.setRole(Role.ADMIN);
        testUser.setDateOfBirth(new Date());

//      userRepository.save(testUser);
    }
}
