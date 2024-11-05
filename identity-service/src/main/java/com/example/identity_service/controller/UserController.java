package com.example.identity_service.controller;

import com.example.identity_service.dto.respone.ApiRespone;
import com.example.identity_service.dto.request.UserCreationRequest;
import com.example.identity_service.dto.request.UserUpdateRequest;
import com.example.identity_service.entity.User;
import com.example.identity_service.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping
    ApiRespone<User> createUser(@RequestBody @Valid UserCreationRequest request){
        ApiRespone<User> apiRespone = new ApiRespone<>(true,1000,"Success",userService.createUser(request));
        return apiRespone;
    }

    @GetMapping
    List<User> getUser(){
        return userService.getUser();
    }

    @GetMapping("/{userId}")
    User getUser(@PathVariable("userId") String userId){
        return  userService.getUser(userId);
    }

    @PutMapping("/{userId}")
    User updateUser(@PathVariable("userId") String userId, @RequestBody UserUpdateRequest request){
        return userService.updateUser(userId,request);
    }

    @DeleteMapping("/{userId}")
    String deleteUser(@PathVariable String userId){
        userService.deleteUser(userId);
        return "user has been deleted";
    }
}
