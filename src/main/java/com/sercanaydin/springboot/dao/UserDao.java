package com.sercanaydin.springboot.dao;

import com.sercanaydin.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserDao extends JpaRepository<User, Long> {

    List<User> findAllByKullaniciAdi(String name);

}
