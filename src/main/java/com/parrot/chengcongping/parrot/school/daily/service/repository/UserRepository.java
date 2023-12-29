package com.parrot.chengcongping.parrot.school.daily.service.repository;

import com.parrot.chengcongping.parrot.school.daily.service.entity.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserInfoEntity, Long> {
    UserInfoEntity findByUserName(String userName);
    UserInfoEntity findByRegisterId(Long registerId);
}
