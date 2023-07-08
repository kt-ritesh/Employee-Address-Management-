package com.ritesh.EmployeeAddress.Management.controller;

import com.ritesh.EmployeeAddress.Management.model.Address;
import com.ritesh.EmployeeAddress.Management.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping(value = "addAddress")
    public String addAddress(@RequestBody Address address){
        return addressService.saveAddress(address);
    }
    @GetMapping(value = "/allAddress")
    public List<Address> getAllAddress(){
        return addressService.getAddress();
    }
    @GetMapping(value = "/allAddressById/{id}")
    public List<Address> getAllAddressById(@PathVariable Long id){
        return addressService.getById(id);
    }

    @PutMapping(value = "/updateAddressById/{id}")
    public String updateAddress(@RequestBody Address address , @PathVariable Long id){
        return addressService.updateById(address , id);
    }
    @DeleteMapping(value = "deleteAddressById/{id}")
    public String deleteAddress(@PathVariable Long id){
        return addressService.deleteById(id);
    }
}
