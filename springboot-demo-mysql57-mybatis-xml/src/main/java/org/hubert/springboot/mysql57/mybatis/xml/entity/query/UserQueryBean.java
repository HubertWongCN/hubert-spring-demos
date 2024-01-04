package org.hubert.springboot.mysql57.mybatis.xml.entity.query;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserQueryBean {

    /**
     * contains name pattern.
     */
    private String userName;

    /**
     * contains desc pattern.
     */
    private String description;

    private String phoneNumber;

    private String email;

}
