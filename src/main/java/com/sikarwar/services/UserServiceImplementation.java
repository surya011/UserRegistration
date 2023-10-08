package com.sikarwar.services;

import com.sikarwar.models.User;
import com.sikarwar.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService {

    private UserRepository userRepository;

    public UserServiceImplementation (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User registerUser(User user) {
        // Implement registration logic and save to the db using userRepository
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        // Implement logic to fetch all saved users details from db
        return userRepository.findAll();
    }
}
