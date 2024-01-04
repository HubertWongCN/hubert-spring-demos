package org.hubert.springboot.mysql57.mybatisplus.annotation.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.hubert.springboot.mysql57.mybatisplus.annotation.dao.UserDao;
import org.hubert.springboot.mysql57.mybatisplus.annotation.entity.User;
import org.hubert.springboot.mysql57.mybatisplus.annotation.entity.query.UserQueryBean;
import org.hubert.springboot.mysql57.mybatisplus.annotation.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

    @Override
    public List<User> findList(UserQueryBean userQueryBean) {
        return baseMapper.findList(userQueryBean);
    }
}
