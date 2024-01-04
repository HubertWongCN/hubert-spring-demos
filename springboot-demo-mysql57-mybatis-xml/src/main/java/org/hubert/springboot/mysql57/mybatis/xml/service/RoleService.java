package org.hubert.springboot.mysql57.mybatis.xml.service;

import org.hubert.springboot.mysql57.mybatis.xml.entity.Role;
import org.hubert.springboot.mysql57.mybatis.xml.entity.query.RoleQueryBean;

import java.util.List;

/**
 * @author hubertwong
 */
public interface RoleService {
    /**
     * find by page
     *
     * @param roleQueryBean {@link  RoleQueryBean}
     * @return page
     */
    List<Role> findList(RoleQueryBean roleQueryBean);
}
