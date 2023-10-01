package com.geekster.Ecommerce.repo;

import com.geekster.Ecommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUser extends JpaRepository<User,Integer> {
}
