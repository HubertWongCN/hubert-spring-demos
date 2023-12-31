package org.hubert.springframework.service;

import org.hubert.springframework.entity.User;

import java.util.List;

/**
 * @author hubertwong
 */
public interface UserService {
    /**
     * find user list
     *
     * @return user list
     */
    List<User> findUserList();

    /**
     * add user
     */
    void addUser();
}
