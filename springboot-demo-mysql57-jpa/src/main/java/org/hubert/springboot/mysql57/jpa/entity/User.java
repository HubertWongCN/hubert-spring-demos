package org.hubert.springboot.mysql57.jpa.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serial;
import java.time.LocalDateTime;
import java.util.Set;

/**
 * @author hubertwong
 */
@Getter
@Setter
@ToString
@Entity
@Table(name = "tb_user")
public class User implements BaseEntity {
    @Serial
    private static final long serialVersionUID = -1596960513109635892L;
    /**
     * user's id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    /**
     * username.
     */
    private String userName;
    /**
     * password
     */
    private String password;
    /**
     * email
     */
    private String email;
    /**
     * phoneNumber
     */
    private Long phoneNumber;
    /**
     * description
     */
    private String description;
    /**
     * create date time
     */
    private LocalDateTime createTime;
    /**
     * update date time
     */
    private LocalDateTime updateTime;
    /**
     * join to role table
     */
    @ManyToMany(cascade = {CascadeType.REFRESH}, fetch = FetchType.EAGER)
    @JoinTable(name = "tb_user_role",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")})
    private Set<Role> roles;
}
