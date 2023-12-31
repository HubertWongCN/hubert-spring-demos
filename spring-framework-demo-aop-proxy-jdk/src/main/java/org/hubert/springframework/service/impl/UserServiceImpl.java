package org.hubert.springframework.service.impl;

import org.hubert.springframework.entity.User;
import org.hubert.springframework.service.UserService;

import java.util.Collections;
import java.util.List;

/**
 * @author hubertwong
 */
public class UserServiceImpl implements UserService {
    @Override
    public List<User> findUserList() {
        return Collections.singletonList(new User("hubert", 18));
    }

    @Override
    public void addUser() {
        // do something
    }
}
