package net.rhm.microuser.controller;

import lombok.extern.slf4j.Slf4j;
import net.rhm.microuser.entity.User;
import net.rhm.microuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
@Slf4j
public class UserController {

    private UserService userService;

    @Autowired
    UserController(UserService userService) {
        this.userService = userService;
    }

    //@PreAuthorize("hasAuthority('ROLE_USER')")
    @RequestMapping(method = RequestMethod.GET, path = "/member")
    public ResponseEntity<Iterable<User>> getAll(@RequestHeader(value="User-Agent") String userAgent) {
        Iterable<User> all = userService.findAll();
        log.info("Hello me !!" + userAgent);
        return new ResponseEntity<>(all, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/member")
    public ResponseEntity<User> register(@RequestBody User input, @RequestHeader HttpHeaders headers) {
        User result = userService.registerUser(input);
        log.info("Hello me !!" + headers);

        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
