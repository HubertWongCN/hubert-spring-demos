package org.hubert.springboot.validation.i18n.param;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @author hubertwong
 */
@Data
@Builder
@AllArgsConstructor
public class AddressParam {

    private String city;

    private String zipcode;
}
