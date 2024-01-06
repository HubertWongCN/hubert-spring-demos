package org.hubert.springboot.postgre.jpa.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;
import org.hubert.springboot.postgre.jpa.constants.PGConstants;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author hubertwong
 */
@Getter
@Setter
@ToString
@Entity
@Table(name = "tb_role")
public class Role implements BaseEntity {

    /**
     * role id.
     */
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(generator = PGConstants.ID_GENERATOR)
    @GenericGenerator(name = PGConstants.ID_GENERATOR, strategy = PGConstants.ID_GENERATOR_CONFIG)
    private Long id;

    /**
     * role name.
     */
    private String name;

    /**
     * role key.
     */
    private String roleKey;

    /**
     * description.
     */
    private String description;

    /**
     * create date time.
     */
    private LocalDateTime createTime;

    /**
     * update date time.
     */
    private LocalDateTime updateTime;

}
