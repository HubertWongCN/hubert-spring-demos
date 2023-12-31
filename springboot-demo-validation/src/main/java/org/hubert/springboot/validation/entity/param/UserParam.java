package org.hubert.springboot.validation.entity.param;

import lombok.Builder;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * @author hubertwong
 */
@Data
@Builder
public class UserParam implements Serializable {
    private static final long serialVersionUID = 6198474158786888L;

    @NotEmpty(message = "could not be empty")
    private String userId;

    @NotEmpty(message = "could not be empty")
    @Email(message = "invalid email")
    private String email;

    @NotEmpty(message = "could not be empty")
    @Pattern(regexp = "^(\\d{6})(\\d{4})(\\d{2})(\\d{2})(\\d{3})([0-9]|X)$", message = "invalid ID")
    private String cardNo;

    @NotEmpty(message = "coule not be empty")
    @Length(min = 1, max = 10, message = "nick name should be 1-10")
    private String nickName;

    @NotNull(message = "could not be empty")
    @Range(min = 0, max = 1, message = "sex should be 0-1")
    private Integer sex;

    @NotNull(message = "could not be empty")
    @Range(min = 0, max = 200, message = "Please input valid age")
    private Integer age;

    @Valid
    private AddressParam address;
}
