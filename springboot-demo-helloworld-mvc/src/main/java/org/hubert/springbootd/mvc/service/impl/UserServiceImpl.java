package org.hubert.springbootd.mvc.service.impl;

import org.hubert.springbootd.mvc.dao.UserRepository;
import org.hubert.springbootd.mvc.entity.User;
import org.hubert.springbootd.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hubertwong
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> list() {
        return userRepository.findAll();
    }
}
