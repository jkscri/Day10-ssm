package com.qf.controller;

import com.qf.bean.User;
import com.qf.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/user/findall")
    public String findall(ModelMap map){
        List list = userService.findall();
        map.addAttribute("ulist",list);
        return "show";
    }

}
