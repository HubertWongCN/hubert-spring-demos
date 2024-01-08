package org.hubert.springboot.mysql.jpa.dockercompose.dao;

import org.hubert.springboot.mysql.jpa.dockercompose.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author hubertwong
 */
@Repository
public interface UserDao extends BaseDao<User, Long> {
}
