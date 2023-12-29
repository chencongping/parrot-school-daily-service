package com.parrot.chengcongping.parrot.school.daily.service.controller;

import com.parrot.chengcongping.parrot.school.daily.service.DateFormat;
import com.parrot.chengcongping.parrot.school.daily.service.entity.UserInfoEntity;
import com.parrot.chengcongping.parrot.school.daily.service.services.UserService;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired private UserService userService;

    @PostMapping("register")
    public UserInfoEntity registerUser(UserInfoEntity userInfo){
        var date = new SimpleDateFormat(DateFormat.DATE_TIME.getFormat()).format(new Date());
        userInfo.setCreateTime(date);
        userInfo.setUpdateTime(date);
        return userService.registerUser(userInfo);
    }
}
