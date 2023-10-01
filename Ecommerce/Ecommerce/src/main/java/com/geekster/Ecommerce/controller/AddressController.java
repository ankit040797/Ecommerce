package com.geekster.Ecommerce.controller;

import com.geekster.Ecommerce.model.Address;
import com.geekster.Ecommerce.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("address")
    public String addAddress(@RequestBody Address newAddress) {
        return addressService.saveAddress(newAddress);
    }

    @GetMapping("address")
    public List<Address> getAddress() {
        return addressService.getAddress();
    }

    @PutMapping("address/{id}")
    public String updateAddress(@PathVariable Integer id) {
        return addressService.updateAddress(id);
    }

    @DeleteMapping("address/{id}")
    public String removeAddress(@PathVariable Integer id) {
        return addressService.removeAddress(id);
    }

}
