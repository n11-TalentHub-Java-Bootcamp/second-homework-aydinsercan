package com.sercanaydin.springboot.controller;


import com.sercanaydin.springboot.converter.UserConverter;
import com.sercanaydin.springboot.dto.UserDto;
import com.sercanaydin.springboot.entity.User;
import com.sercanaydin.springboot.service.entityservice.UserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserEntityService userEntityService;

    @GetMapping("")
    public List<UserDto> findAll(){
        List<User> list = userEntityService.findAll();
        List<UserDto> listDto = UserConverter.INSTANCE.convertUserListToUserDtoList(list);
        return listDto;
    }
    @GetMapping("/{name}")
    public User findAllByKullaniciAdi(@PathVariable String name){
        User user = userEntityService.findAllByKullaniciAdi(name);
        return user;
    }
    @GetMapping("/{telephone}")
    public User findAllByTelephone(@PathVariable Long telefon){
        User user = userEntityService.findAllByTelephone(telefon);
        return user;
    }

    @PostMapping("")
    public ResponseEntity<Object> save(@RequestBody UserDto userDto){

        User user = UserConverter.INSTANCE.convertUserDtoToUser(userDto);


        user = UserEntityService.save(user);

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(user.getId())
                .toUri();

        return ResponseEntity.created(uri).build();
    }

    @PutMapping("")
    public UserDto update(@RequestBody UserDto userDto){//TODO: Input değeri dto tipinde olmalı

        User user = UserConverter.INSTANCE.convertUserDtoToUser(userDto);

        user = userEntityService.save(user);

        UserDto userDtoResult = UserConverter.INSTANCE.convertUserToUserDto(user);

        return userDtoResult;
    }

    @DeleteMapping("/{id}")
    public void delete(Long id){
        userEntityService.deleteById(id);
    }


}
