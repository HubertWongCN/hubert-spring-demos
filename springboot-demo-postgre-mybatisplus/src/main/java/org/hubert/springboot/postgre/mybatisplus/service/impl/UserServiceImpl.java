package org.hubert.springboot.postgre.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.hubert.springboot.postgre.mybatisplus.dao.UserDao;
import org.hubert.springboot.postgre.mybatisplus.entity.User;
import org.hubert.springboot.postgre.mybatisplus.entity.query.UserQueryBean;
import org.hubert.springboot.postgre.mybatisplus.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

    @Override
    public List<User> findList(UserQueryBean userQueryBean) {
        return baseMapper.findList(userQueryBean);
    }
}
