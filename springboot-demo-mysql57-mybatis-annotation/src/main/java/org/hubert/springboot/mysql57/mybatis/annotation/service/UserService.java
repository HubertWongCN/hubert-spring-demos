package org.hubert.springboot.mysql57.mybatis.annotation.service;


import org.hubert.springboot.mysql57.mybatis.annotation.entity.User;
import org.hubert.springboot.mysql57.mybatis.annotation.entity.query.UserQueryBean;

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

    User findById2(Long userId);
}
