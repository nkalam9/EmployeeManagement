package com.infy.empmanagement.service.serviceimpl;

import com.infy.empmanagement.entity.Users;
import com.infy.empmanagement.repository.UserRepository;
import com.infy.empmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Users> getAllUsers() {
        return (List<Users>) userRepository.findAll();
    }

    @Override
    public Users getUserById(int userId) {
        return userRepository.findById(userId).orElse(null);
    }

    @Override
    public Users addOrUpdateUser(Users user) {
        return userRepository.save(user);
    }

    @Override
    public Users deleteUser(int userId) {
        return null;
    }

    @Override
    public List<Users> getUserByEmail(String emailId) {
        return userRepository.findByEmailId(emailId);
    }

    @Override
    public List<Users> getUserByMobile(String mobile) {
        return userRepository.findByMobile(mobile);
    }
}
