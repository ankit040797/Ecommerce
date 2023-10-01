package com.geekster.Ecommerce.service;

import com.geekster.Ecommerce.model.User;
import com.geekster.Ecommerce.repo.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    IUser iUser;
    public String saveUser(User newUser) {
        iUser.save(newUser);
        return "added";

    }


    public List<User> getUsers() {
        return iUser.findAll();
    }


    public String updateUser(Integer id) {
        User add=iUser.findById(id).get();
        add.setName("Ankit");
        iUser.save(add);
        return "updated";
    }

    public String removeUser(Integer id) {
        iUser.deleteById(id);
        return "removed";
    }
}
