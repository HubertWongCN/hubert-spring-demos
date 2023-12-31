package org.hubert.springframework.springmvc.service;

import org.hubert.springframework.springmvc.dao.UserDaoImpl;
import org.hubert.springframework.springmvc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hubertwong
 */
@Service
public class UserServiceImpl {
    /**
     * user dao impl
     */
    @Autowired
    private UserDaoImpl userDao;

    /**
     * find user list
     *
     * @return user list
     */
    public List<User> findUserList() {
        return userDao.findUserList();
    }
}
