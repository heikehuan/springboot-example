package com.example.controller;

import com.example.bean.UserBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

/**
 * Created by ptmind on 2016/5/16.
 */
@Controller
public class Demo {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public UserBean home() {
        UserBean userBean = new UserBean();
        userBean.setUserId(UUID.randomUUID().toString().replace("-", ""));
        userBean.setUsername("huan");
        userBean.setPassword("123456");
        return userBean;
    }

}
