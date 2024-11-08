package com.example.identity_service.service;

import com.example.identity_service.dto.request.UserCreationRequest;
import com.example.identity_service.dto.request.UserUpdateRequest;
import com.example.identity_service.entity.User;
import com.example.identity_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public User createUser(UserCreationRequest request) {
        if (userRepository.existsByUsername(request.getUsername())) {
            throw new RuntimeException("User already exists");
        }

        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setDob(request.getDob());
        user.setFirstName(request.getFirstName()); // Đảm bảo giá trị lấy từ request đúng
        user.setLastName(request.getLastName());   // Đảm bảo giá trị lấy từ request đúng

        return userRepository.save(user);
    }

    public List<User> getUser(){
        return userRepository.findAll();
    }

    public User getUser(String id){
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

    public User updateUser(String userId,UserUpdateRequest request){
        User user = getUser(userId);
        user.setPassword(request.getPassword());
        user.setDob(request.getDob());
        user.setFirstName(user.getFirstName());
        user.setLastName(user.getLastName());

        return userRepository.save(user);
    }

    public void deleteUser(String userId){
        userRepository.deleteById(userId);
    }

}
