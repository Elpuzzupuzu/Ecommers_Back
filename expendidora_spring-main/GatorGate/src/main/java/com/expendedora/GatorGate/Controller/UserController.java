package com.expendedora.GatorGate.Controller;


import com.expendedora.GatorGate.Model.User;
import com.expendedora.GatorGate.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user.getUsername(), user.getPassword(), user.getEmail());
    }
}
