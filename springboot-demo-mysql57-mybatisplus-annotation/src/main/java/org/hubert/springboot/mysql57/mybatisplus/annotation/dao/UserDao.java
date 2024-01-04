package org.hubert.springboot.mysql57.mybatisplus.annotation.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.hubert.springboot.mysql57.mybatisplus.annotation.entity.User;
import org.hubert.springboot.mysql57.mybatisplus.annotation.entity.query.UserQueryBean;

import java.util.List;

/**
 * @author hubertwong
 */
public interface UserDao extends BaseMapper<User> {

    List<User> findList(UserQueryBean userQueryBean);
}
