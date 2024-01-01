package org.hubert.springboot.h2.service;

import org.hubert.springboot.h2.entity.User;

import java.util.List;

/**
 * @author hubertwong
 */
public interface UserService {
    /**
     * add user
     *
     * @param user user
     */
    void addUser(User user);

    /**
     * get user list
     *
     * @return user list
     */
    List<User> list();
}
