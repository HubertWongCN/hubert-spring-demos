package org.hubert.springboot.mysql57.mybatisplus.tenant.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.hubert.springboot.mysql57.mybatisplus.tenant.dao.UserDao;
import org.hubert.springboot.mysql57.mybatisplus.tenant.entity.User;
import org.hubert.springboot.mysql57.mybatisplus.tenant.entity.query.UserQueryBean;
import org.hubert.springboot.mysql57.mybatisplus.tenant.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

    @Override
    public List<User> findList(UserQueryBean userQueryBean) {
        return baseMapper.findList(userQueryBean);
    }
}
