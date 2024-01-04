package org.hubert.springboot.mysql57.mybatisplus.tenant.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.hubert.springboot.mysql57.mybatisplus.tenant.entity.User;
import org.hubert.springboot.mysql57.mybatisplus.tenant.entity.query.UserQueryBean;

import java.util.List;

/**
 * @author hubertwong
 */
public interface UserDao extends BaseMapper<User> {

    List<User> findList(UserQueryBean userQueryBean);
}
