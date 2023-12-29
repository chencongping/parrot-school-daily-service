package com.parrot.chengcongping.parrot.school.daily.service.controller;

import com.parrot.chengcongping.parrot.school.daily.service.DateFormat;
import com.parrot.chengcongping.parrot.school.daily.service.entity.DailyInEntity;
import com.parrot.chengcongping.parrot.school.daily.service.services.DailyService;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("daily")
@Slf4j
public class DailyController {

    @Autowired private DailyService dailyService;

    @PostMapping("save")
    public String save(@RequestBody DailyInEntity form){
        var date = new SimpleDateFormat(DateFormat.DATE_TIME.getFormat()).format(new Date());
        form.setCreateTime(date);
        form.setUpdateTime(date);
        form.setUserId("chenaiping");
        log.info("save form = {}",form);
        dailyService.saveDaily(form);
        return form.toString();
    }

    @PostMapping("all")
    public List<DailyInEntity> all(){
        return dailyService.findAll();
    }
}
