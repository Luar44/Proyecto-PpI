package com.example.BBR.Controllers;

import com.example.BBR.Models.UserModel;
import com.example.BBR.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    //get
    @GetMapping()
    public ArrayList<UserModel> findAllUsers(){
        return userService.findAllUsers();
    }
    //post
    @PostMapping()
    public UserModel saveUser(@RequestBody UserModel user){
        return userService.saveUser(user);
    }
}
