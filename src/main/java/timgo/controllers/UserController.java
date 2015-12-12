package timgo.controllers;

import timgo.common.Paths;
import timgo.model.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import timgo.services.UserService;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = Paths.GET_USER_METHOD)
    public User getUser(@RequestParam("id") Integer id) {
        return userService.getUser(id);
    }
}