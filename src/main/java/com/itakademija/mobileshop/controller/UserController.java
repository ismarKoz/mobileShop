package com.itakademija.mobileshop.controller;

import com.itakademija.mobileshop.model.Role;
import com.itakademija.mobileshop.model.User;
import com.itakademija.mobileshop.repository.UserRepository;
import com.itakademija.mobileshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    //ovjde treba provjeriti jos nesto malo mi je sumnjivo
  @GetMapping("/")
    public String viewAdmin() {
        return "index";
    }

    @GetMapping("/users")
    public String viewUsers(Model model) {
        List<User> userList = userService.getAllUsers();
        model.addAttribute("listaKorisnika", userList);
        return "userControl";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Neisparavan korisnički ID: " + id));
        userRepository.delete(user);
        return "redirect:/";
    }

    @GetMapping("/register")
    public String showNewUserForm(Model model) {
        User user = new User();
        model.addAttribute("prazanKorisnik", user);
        return "register";
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("prazanKorisnik") User user) {
        user.setRole(Role.USER);
        String hashedPassword = bCryptPasswordEncoder.encode(user.getPassword());
        user.setPassword(hashedPassword);
        userService.saveUser(user);
        return "redirect:/";
    }
}




