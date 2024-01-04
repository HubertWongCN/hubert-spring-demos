package org.hubert.springboot.mysql57.jpa.service.impl;

import com.github.wenhao.jpa.Specifications;
import org.apache.commons.lang3.StringUtils;
import org.hubert.springboot.mysql57.jpa.dao.BaseDao;
import org.hubert.springboot.mysql57.jpa.dao.UserDao;
import org.hubert.springboot.mysql57.jpa.entity.User;
import org.hubert.springboot.mysql57.jpa.entity.query.UserQueryBean;
import org.hubert.springboot.mysql57.jpa.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

/**
 * @author hubertwong
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User, Long> implements UserService {
    /**
     * userDao
     */
    private final UserDao userDao;

    /**
     * init
     *
     * @param userDao user dao
     */
    public UserServiceImpl(final UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Page<User> findPage(UserQueryBean userQueryBean, PageRequest pageRequest) {
        Specification<User> specification = Specifications.<User>and()
                .like(StringUtils.isNotEmpty(userQueryBean.getName()), "user_name", userQueryBean.getName())
                .like(StringUtils.isNotEmpty(userQueryBean.getDescription()), "description",
                        userQueryBean.getDescription())
                .build();
        return this.getBaseDao().findAll(specification, pageRequest);
    }

    @Override
    public BaseDao<User, Long> getBaseDao() {
        return this.userDao;
    }
}
