package org.hubert.springframework.springmvc.dao;

import org.hubert.springframework.springmvc.entity.User;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

/**
 * @author hubertwong
 */
@Repository
public class UserDaoImpl {
    /**
     * mocked to find user list
     *
     * @return user list
     */
    public List<User> findUserList() {
        return Collections.singletonList(new User("hubert", 18));
    }
}
