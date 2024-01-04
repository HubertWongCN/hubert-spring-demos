package org.hubert.springboot.mysql57.mybatis.xml.dao;

import org.apache.ibatis.annotations.Mapper;
import org.hubert.springboot.mysql57.mybatis.xml.entity.Role;
import org.hubert.springboot.mysql57.mybatis.xml.entity.query.RoleQueryBean;

import java.util.List;

/**
 * @author hubertwong
 */
@Mapper
public interface RoleDao {

    List<Role> findList(RoleQueryBean roleQueryBean);
}
