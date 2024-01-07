package org.hubert.spring.boot.file.excel.easyexcel.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hubertwong
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements BaseEntity {

    private static final long serialVersionUID = 8434728100346617875L;
    /**
     * user id.
     */
    @ExcelProperty("ID")
    private Long id;

    /**
     * username.
     */
    @ExcelProperty("Name")
    private String userName;

    /**
     * email.
     */
    @ExcelProperty("Email")
    private String email;

    /**
     * phoneNumber.
     */
    @ExcelProperty("Phone")
    private long phoneNumber;

    /**
     * description.
     */
    @ExcelProperty("Description")
    private String description;


}
