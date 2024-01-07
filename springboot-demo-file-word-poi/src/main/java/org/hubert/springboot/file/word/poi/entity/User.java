package org.hubert.springboot.file.word.poi.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author hubertwong
 */

@Builder
@Data
public class User implements BaseEntity {

    private static final long serialVersionUID = 8415866515989266435L;
    /**
     * user id.
     */
    private Long id;

    /**
     * username.
     */
    private String userName;

    /**
     * email.
     */
    private String email;

    /**
     * phoneNumber.
     */
    private long phoneNumber;

    /**
     * description.
     */
    private String description;


}
