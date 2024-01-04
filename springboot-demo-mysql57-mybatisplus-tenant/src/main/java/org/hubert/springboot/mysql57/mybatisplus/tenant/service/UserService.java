package org.hubert.springboot.mysql57.mybatisplus.tenant.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.hubert.springboot.mysql57.mybatisplus.tenant.entity.User;
import org.hubert.springboot.mysql57.mybatisplus.tenant.entity.query.UserQueryBean;

import java.util.List;

/**
 * @author hubertwong
 */
public interface UserService extends IService<User> {

    List<User> findList(UserQueryBean userQueryBean);

}