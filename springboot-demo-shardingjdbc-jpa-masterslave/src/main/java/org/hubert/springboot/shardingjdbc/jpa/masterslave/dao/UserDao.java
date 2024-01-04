package org.hubert.springboot.shardingjdbc.jpa.masterslave.dao;

import org.hubert.springboot.shardingjdbc.jpa.masterslave.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author hubertwong
 */
@Repository
public interface UserDao extends BaseDao<User, Long> {

}
