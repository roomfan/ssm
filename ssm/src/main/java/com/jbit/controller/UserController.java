package com.jbit.controller;

import com.jbit.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/2/2.
 */
@Controller("userController")
public class UserController {

    @Resource
    private UsersService usersService;

    @RequestMapping("login")
    public String login(Model model){

        model.addAttribute("msg","Hello");

        return "login";
    }

}
