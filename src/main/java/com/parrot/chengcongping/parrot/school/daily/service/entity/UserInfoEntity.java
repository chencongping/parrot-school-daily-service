package com.parrot.chengcongping.parrot.school.daily.service.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "sd_user_info")
public class UserInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long registerId;
    private String userName;
    private String nickName;
    private String email;
    private String createTime;
    private String updateTime;
}
