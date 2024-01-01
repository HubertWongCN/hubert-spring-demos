package org.hubert.springboot.h2.service.UserServiceImpl;

import org.hubert.springboot.h2.dao.UserRepository;
import org.hubert.springboot.h2.entity.User;
import org.hubert.springboot.h2.service.UserService;
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
