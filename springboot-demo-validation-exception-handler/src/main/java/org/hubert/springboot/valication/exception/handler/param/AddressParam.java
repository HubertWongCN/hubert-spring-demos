package org.hubert.springboot.valication.exception.handler.param;

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
