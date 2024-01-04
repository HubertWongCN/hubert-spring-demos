package org.hubert.springboot.shardingjdbc.jpa.tables.dao;

import org.hubert.springboot.shardingjdbc.jpa.tables.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author hubertwong
 */
@Repository
public interface UserDao extends BaseDao<User, Long> {

}
