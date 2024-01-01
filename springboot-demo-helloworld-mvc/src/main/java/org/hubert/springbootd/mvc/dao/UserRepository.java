package org.hubert.springbootd.mvc.dao;

import org.hubert.springbootd.mvc.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hubertwong
 */
@Repository
public class UserRepository {

    private final List<User> userDemoList = new ArrayList<>();

    public void  save(User user) {
        userDemoList.add(user);
    }

    public List<User> findAll() {
        return userDemoList;
    }
}
