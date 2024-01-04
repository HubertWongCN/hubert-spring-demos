package org.hubert.springboot.shardingjdbc.jpa.masterslave.service;

import org.hubert.springboot.shardingjdbc.jpa.masterslave.entity.User;
import org.hubert.springboot.shardingjdbc.jpa.masterslave.entity.query.UserQueryBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * @author hubertwong
 */
public interface UserService extends BaseService<User, Long> {

    /**
     * find by page.
     *
     * @param userQueryBean query
     * @param pageRequest   pageRequest
     * @return page
     */
    Page<User> findPage(UserQueryBean userQueryBean, PageRequest pageRequest);

}
