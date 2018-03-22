package com.gemjy.controller;


import com.gemjy.pojo.System_user;
import com.gemjy.service.System_userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("system_user")
public class System_userController {
    @Autowired
    private System_userService system_userService;

    @RequestMapping("getSysUser")
        public ModelAndView getSysUser(String id){
            ModelAndView modelAndView =new ModelAndView();
            System_user system_user = system_userService.getSystem_userByID(id);
            modelAndView.addObject("system_user",system_user);
            //jsp的路径
            modelAndView.setViewName("system_user/getSysUser");
            return modelAndView;
}
}
