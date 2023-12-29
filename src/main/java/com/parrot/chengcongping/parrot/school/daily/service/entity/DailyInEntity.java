package com.parrot.chengcongping.parrot.school.daily.service.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "sd_daily_in")
public class DailyInEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String businessDate;
    private int tea;
    private double longRun;
    private String shortRun;
    private int words;
    private String texts;
    private int questions;
    private String praise;
    private String improvement;
    private String other;
    private String createTime;
    private String updateTime;
    private String userId;
}
