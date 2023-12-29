package com.parrot.chengcongping.parrot.school.daily.service.services;

import com.parrot.chengcongping.parrot.school.daily.service.entity.DailyInEntity;
import com.parrot.chengcongping.parrot.school.daily.service.repository.DailyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DailyService {

    @Autowired
    private DailyRepository dailyRepository;

    public void saveDaily(DailyInEntity daily){
        DailyInEntity byBusinessDate = dailyRepository.findByBusinessDate(daily.getBusinessDate());
        if(byBusinessDate !=null){
            daily.setId(byBusinessDate.getId());
        }
        dailyRepository.save(daily);
    }

    public List<DailyInEntity> findAll() {
        return dailyRepository.findAll();
    }
}
