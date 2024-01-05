package org.hubert.springboot.sharding.jpa.tenant.db.dao;

import org.hubert.springboot.sharding.jpa.tenant.db.entity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * @author hubertwong
 */
@NoRepositoryBean
public interface BaseDao<T extends BaseEntity, I extends Serializable>
        extends JpaRepository<T, I>, JpaSpecificationExecutor<T> {
}
