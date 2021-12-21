package com.sercanaydin.springboot.service.entityservice;

import com.sercanaydin.springboot.dao.UserDao;
import com.sercanaydin.springboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserEntityService {

    @Autowired
    private UserDao userDao;

    public List<User> findAll(){
        return userDao.findAll();
    }

    public List<User> findAllByKullaniciAdi(String name){
        return userDao.findAllByKullaniciAdi(name);
    }

    public List<User> findAllByTelephone(Long telefon){
        return userDao.findAllByKullaniciAdi(telefon);
    }
}
