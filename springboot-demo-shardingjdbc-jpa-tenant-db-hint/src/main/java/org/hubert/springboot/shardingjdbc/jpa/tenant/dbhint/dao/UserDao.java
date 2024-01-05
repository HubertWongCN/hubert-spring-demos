package org.hubert.springboot.shardingjdbc.jpa.tenant.dbhint.dao;

import org.hubert.springboot.shardingjdbc.jpa.tenant.dbhint.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author hubertwong
 */
@Repository
public interface UserDao extends BaseDao<User, Long> {

}
