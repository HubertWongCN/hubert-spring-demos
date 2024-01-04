package org.hubert.springboot.mysql57.mybatisplus.xml.service.impl;

import org.hubert.springboot.mysql57.mybatisplus.xml.dao.UserDao;
import org.hubert.springboot.mysql57.mybatisplus.xml.entity.User;
import org.hubert.springboot.mysql57.mybatisplus.xml.entity.query.UserQueryBean;
import org.hubert.springboot.mysql57.mybatisplus.xml.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    /**
     * userDao.
     */
    private final UserDao userDao;

    /**
     * init.
     *
     * @param userDao2 user dao
     */
    public UserServiceImpl(final UserDao userDao2) {
        this.userDao = userDao2;
    }

    @Override
    public List<User> findList(UserQueryBean userQueryBean) {
        return userDao.findList(userQueryBean);
    }

    @Override
    public User findById(Long id) {
        return userDao.findById(id);
    }

    @Override
    public int deleteById(Long id) {
        return userDao.deleteById(id);
    }

    @Override
    public int deleteByIds(Long[] ids) {
        return userDao.deleteByIds(ids);
    }

    @Override
    public int update(User user) {
        return userDao.update(user);
    }

    @Override
    public int save(User user) {
        return userDao.save(user);
    }

    @Override
    public int updatePassword(User user) {
        return userDao.updatePassword(user);
    }
}
