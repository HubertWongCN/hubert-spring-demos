package org.hubert.springboot.postgre.mybatisplus.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.hubert.springboot.postgre.mybatisplus.entity.User;
import org.hubert.springboot.postgre.mybatisplus.entity.query.UserQueryBean;

import java.util.List;

/**
 * @author hubertwong
 */
public interface UserDao extends BaseMapper<User> {

    List<User> findList(UserQueryBean userQueryBean);
}
