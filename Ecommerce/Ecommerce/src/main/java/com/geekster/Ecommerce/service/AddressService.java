package com.geekster.Ecommerce.service;

import com.geekster.Ecommerce.model.Address;
import com.geekster.Ecommerce.repo.IAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    IAddress address;

    public String saveAddress(Address newAddress) {
        address.save(newAddress);
        return "added";
    }

    public List<Address> getAddress() {
        return address.findAll();
    }

    public String updateAddress(Integer id) {
        Address add=address.findById(id).get();
        add.setAddName("c-559");
        address.save(add);
        return "update";
    }


    public String removeAddress(Integer id) {
        address.deleteById(id);
        return "removed";
    }
}
