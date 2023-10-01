package com.geekster.Ecommerce.repo;

import com.geekster.Ecommerce.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddress extends JpaRepository<Address,Integer> {

}
