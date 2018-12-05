package net.rhm.microuser.controller;

import net.rhm.microuser.entity.User;
import net.rhm.microuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET, path = "/member")
    public ResponseEntity<Iterable<User>> getAll() {
        Iterable<User> all = userService.findAll();
        return new ResponseEntity<>(all, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/member")
    public ResponseEntity<User> register(@RequestBody User input) {
        User result = userService.registerUser(input);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
