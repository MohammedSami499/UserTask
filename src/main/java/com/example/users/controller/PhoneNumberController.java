package com.example.users.controller;

import com.example.users.entity.PhoneNumbers;
import com.example.users.seviece.phoneNumbers.PhoneNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
public class PhoneNumberController {

    @Autowired
    PhoneNumberService phoneNumberService;

    @PostMapping("/addPhoneNumber")
    public PhoneNumbers addPhoneNumber(@RequestBody PhoneNumbers phone){
        return phoneNumberService.addPhoneNumber(phone);
    }

    @DeleteMapping("/deletePhoneNumber")
    public void deletePhoneNumber(@RequestParam Long id){
         phoneNumberService.deletePhoneNumber(id);
    }



}
