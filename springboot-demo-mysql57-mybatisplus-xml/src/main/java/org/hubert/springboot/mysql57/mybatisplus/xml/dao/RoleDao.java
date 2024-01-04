package org.hubert.springboot.mysql57.mybatisplus.xml.dao;

import org.apache.ibatis.annotations.Mapper;
import org.hubert.springboot.mysql57.mybatisplus.xml.entity.Role;
import org.hubert.springboot.mysql57.mybatisplus.xml.entity.query.RoleQueryBean;

import java.util.List;

/**
 * @author hubertwong
 */
@Mapper
public interface RoleDao {
    List<Role> findList(RoleQueryBean roleQueryBean);
}
