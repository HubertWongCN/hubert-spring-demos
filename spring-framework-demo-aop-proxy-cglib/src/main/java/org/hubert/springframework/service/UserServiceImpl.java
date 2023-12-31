package org.hubert.springframework.service;

import org.hubert.springframework.entity.User;

import java.util.Collections;
import java.util.List;

/**
 * @author hubertwong
 */
public class UserServiceImpl {
    /**
     * find user list
     *
     * @return user list
     */
    public List<User> findUserList() {
        return Collections.singletonList(new User("hubert", 18));
    }

    /**
     * add user
     */
    public void addUser() {
        // do something
    }
}
