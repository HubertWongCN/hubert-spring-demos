package org.hubert.springboot.mysql57.mybatisplus.annotation.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.hubert.springboot.mysql57.mybatisplus.annotation.entity.User;
import org.hubert.springboot.mysql57.mybatisplus.annotation.entity.query.UserQueryBean;

import java.util.List;

/**
 * @author hubertwong
 */
public interface UserService extends IService<User> {

    List<User> findList(UserQueryBean userQueryBean);

}
