package org.hubert.springframework.dao;

import org.hubert.springframework.entity.User;

import java.util.Collections;
import java.util.List;

/**
 * @author hubertwong
 * @date 2023/12/31 00:12
 */
public class UserDaoImpl {
    /**
     * init
     */
    public UserDaoImpl() {
    }

    /**
     * mocked to find user list
     *
     * @return user list
     */
    public List<User> findUserList() {
        return Collections.singletonList(new User("hubert", 18));
    }
}
