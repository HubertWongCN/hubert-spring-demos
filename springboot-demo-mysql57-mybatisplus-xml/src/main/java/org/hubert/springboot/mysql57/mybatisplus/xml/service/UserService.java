package org.hubert.springboot.mysql57.mybatisplus.xml.service;


import org.hubert.springboot.mysql57.mybatisplus.xml.entity.User;
import org.hubert.springboot.mysql57.mybatisplus.xml.entity.query.UserQueryBean;

import java.util.List;

/**
 * @author hubertwong
 */
public interface UserService {

    List<User> findList(UserQueryBean userQueryBean);

    User findById(Long id);

    int deleteById(Long id);

    int deleteByIds(Long[] ids);

    int update(User user);

    int save(User user);

    int updatePassword(User user);

}
