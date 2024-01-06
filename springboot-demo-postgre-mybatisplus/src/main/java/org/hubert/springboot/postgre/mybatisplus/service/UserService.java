package org.hubert.springboot.postgre.mybatisplus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.hubert.springboot.postgre.mybatisplus.entity.User;
import org.hubert.springboot.postgre.mybatisplus.entity.query.UserQueryBean;

import java.util.List;

/**
 * @author hubertwong
 */
public interface UserService extends IService<User> {

    List<User> findList(UserQueryBean userQueryBean);

}
