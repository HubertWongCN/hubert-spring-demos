package org.hubert.springboot.mysql.jpa.druid.service;

import org.hubert.springboot.mysql.jpa.druid.entity.User;
import org.hubert.springboot.mysql.jpa.druid.entity.query.UserQueryBean;
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
