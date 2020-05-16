package com.ssmlecture.controller;

import com.ssmlecture.entity.UserEntity;
import com.ssmlecture.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.annotation.Resource;


@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/getUser")
    public String listCategory(@RequestParam String id, Model model){
        UserEntity user = userService.getUserById(id);
        model.addAttribute("user",user);
        return "index";
    }

}
