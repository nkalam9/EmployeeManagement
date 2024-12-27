package com.infy.empmanagement.controller;

import com.infy.empmanagement.entity.Users;
import com.infy.empmanagement.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    public UserService userService;
    @GetMapping("/allUsers")
    public ResponseEntity<List<Users>> getAllUsers(){
        List<Users> users;
        users = userService.getAllUsers();
        return new ResponseEntity<List<Users>>(users,HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<String> userLogin(@RequestBody Users user){
        return  null;
    }

    @GetMapping("/user/{emailIdOrMobile}")
    public ResponseEntity<List<Users>> userByEmail(@PathVariable String emailIdOrMobile){
        if(emailIdOrMobile.matches("[1-9]{1}\\d{9}")) {
            System.out.println("loggin in using mobile number");
            return new ResponseEntity<List<Users>>(userService.getUserByMobile(emailIdOrMobile), HttpStatus.OK);
        }
        else {
            System.out.println("loggin in using email");
            return new ResponseEntity<List<Users>>(userService.getUserByEmail(emailIdOrMobile), HttpStatus.OK);
        }
    }

    @PostMapping("/addUser")
    public ResponseEntity<Users> addNewUser(@Valid @RequestBody Users user){

        return new ResponseEntity<Users>(userService.addOrUpdateUser(user), HttpStatus.OK);
    }


}
