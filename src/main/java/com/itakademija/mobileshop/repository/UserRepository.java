package com.itakademija.mobileshop.repository;

import com.itakademija.mobileshop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

  //  List<User> findAllById(Long id);

}
