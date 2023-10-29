package com.example.BBR.Services;

import com.example.BBR.Models.UserModel;
import com.example.BBR.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    //obtener a todos los usuarios regisrados
    public ArrayList<UserModel> findAllUsers(){
        return (ArrayList<UserModel>) userRepository.findAll();
    }
    //guardar a un nuevo cliente

    public UserModel saveUser(UserModel user){
        return userRepository.save(user);
    }
}
