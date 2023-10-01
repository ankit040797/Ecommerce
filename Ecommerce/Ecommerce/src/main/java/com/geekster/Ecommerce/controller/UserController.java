package com.geekster.Ecommerce.controller;

import com.geekster.Ecommerce.model.User;
import com.geekster.Ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("user")
    public String addUser(@RequestBody User newUser ){
        return userService.saveUser(newUser);
    }

    @GetMapping("user")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @PutMapping("user/{id}")
    public String updateUser(@PathVariable Integer id){
        return userService.updateUser(id);
    }

    @DeleteMapping("user/{id}")
    public String removeUser(@PathVariable Integer id){
        return userService.removeUser(id);
    }


}
