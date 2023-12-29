package com.parrot.chengcongping.parrot.school.daily.service.controller;

import com.parrot.chengcongping.parrot.school.daily.service.entity.DailyInEntity;
import com.parrot.chengcongping.parrot.school.daily.service.entity.UserInfoEntity;
import com.parrot.chengcongping.parrot.school.daily.service.services.DailyService;
import com.parrot.chengcongping.parrot.school.daily.service.services.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("dashboard")
public class Dashboard {
    @Autowired private DailyService dailyService;
    @Autowired private UserService userService;
    public void importVersion(Model model){
        model.addAttribute("bootstrapVersion", "5.3.2");
        model.addAttribute("jqueryVersion", "3.7.1");
    }
    @GetMapping("/")
    public String index(Model model) {
        List<DailyInEntity> entities = dailyService.findAll();
        model.addAttribute("entities", entities);
        importVersion(model);
        model.addAttribute("userId", "chenaiping");
        return "index";
    }
    @GetMapping("/daily")
    public String daily(Model model) {
        importVersion(model);
        model.addAttribute("userId", "chenaiping");
        return "daily";
    }

    @GetMapping("/all")
    public String all(Model model) {
        importVersion(model);
        List<DailyInEntity> entities = dailyService.findAll();
        model.addAttribute("entities", entities);
        return "all";
    }

    @GetMapping("/register")
    public String register(Model model) {
        importVersion(model);
        return "register";
    }

    @GetMapping("/allUsers")
    public String allUser(Model model) {
        importVersion(model);
        List<UserInfoEntity> entities = userService.findAll();
        model.addAttribute("entities", entities);
        return "allUsers";
    }
}
