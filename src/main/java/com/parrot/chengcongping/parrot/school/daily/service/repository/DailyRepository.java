package com.parrot.chengcongping.parrot.school.daily.service.repository;

import com.parrot.chengcongping.parrot.school.daily.service.entity.DailyInEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DailyRepository extends JpaRepository<DailyInEntity, Long>{
    DailyInEntity findByBusinessDate(String businessDate);
}
