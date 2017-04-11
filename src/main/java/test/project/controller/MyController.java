package test.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import test.project.entity.User;
import test.project.service.UserService;

import java.util.List;

@Controller
@EnableWebMvc
public class MyController {

    private final UserService userService;

    @Autowired
    public MyController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/user&{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Object getUserById(@PathVariable String id) {
        User user = userService.getById(Integer.parseInt(id));
        return user != null ? user : new Object(){
            public String getUser(){
                return "not found";
            }
        };
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<User> getAllUsers() {
        return userService.getAll();
    }
}
