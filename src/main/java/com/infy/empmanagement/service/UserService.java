package com.infy.empmanagement.service;

import com.infy.empmanagement.entity.Users;

import java.util.List;

public interface UserService {
    public List<Users> getAllUsers();
    public Users getUserById(int userId);
    public Users addOrUpdateUser(Users user);
    public Users deleteUser(int userId);
    public List<Users> getUserByEmail(String emailId);
    public List<Users> getUserByMobile(String mobile);
}
