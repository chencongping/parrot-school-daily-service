package com.parrot.chengcongping.parrot.school.daily.service.services;

import com.parrot.chengcongping.parrot.school.daily.service.entity.UserInfoEntity;
import com.parrot.chengcongping.parrot.school.daily.service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired private UserRepository userRepository;

    public UserInfoEntity registerUser(UserInfoEntity userInfo){
        var byUserId = userRepository.findByUserName(userInfo.getUserName());
        if(byUserId != null){
            throw new RuntimeException(String.format("The useId[%s] is exist!", userInfo.getUserName()));
        }
        var save = userRepository.save(userInfo);
        return save;
    }

    public UserInfoEntity updateUserInfo(UserInfoEntity userInfo){
        var byUserId = userRepository.findByUserName(userInfo.getUserName());
        if(byUserId == null){
            throw new RuntimeException(String.format("The useId[%s] is not exist!", userInfo.getUserName()));
        }
        var save = userRepository.save(userInfo);
        return save;
    }

    public List<UserInfoEntity> findAll() {
        return userRepository.findAll();
    }
}
