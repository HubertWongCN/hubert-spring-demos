package org.hubert.springboot.valication.exception.handler.exception;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.List;

/**
 * @author hubertwong
 */
@Data
@Builder
public class ExceptionData {

    @Singular
    private final List<Object> errors;

}
