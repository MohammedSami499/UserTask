package com.example.users.controller;

import com.example.users.entity.PhoneNumbers;
import com.example.users.entity.Roles;
import com.example.users.entity.Users;
import com.example.users.seviece.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getAllUsers")
    public List<Users> getAllUser(){
        System.out.println(userService.getAllUser());
        return userService.getAllUser();
    }


    @PostMapping("/addUser")
    public Users createUser(@RequestBody Users user){
        return userService.addUser(user);
    }

    @PostMapping("/updateUser")
    public Users updateUser(@RequestBody Users user){
        return userService.updateUser(user);
    }

    @PostMapping("/updateUserRole")
    public Users updateUser(@RequestBody Set<Roles> role , Long userId){
        return userService.updateUserRole(userId , role);
    }


    @GetMapping("/getUserById")
    public Optional<Users> getUserById(@RequestParam Long id){
       return userService.getUserById(id);
    }

    @GetMapping("/getPhoneNumberByUserId")
    public Set<PhoneNumbers> getPhoneNumberByUserId(@RequestParam Long id){
        return userService.getPhoneByUserId(id);
    }

}
