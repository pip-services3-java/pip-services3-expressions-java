package org.pipservices3.expressions.mustache;

import org.pipservices3.commons.errors.BadRequestException;

/**
 * Exception that can be thrown by Mustache Template.
 */
public class MustacheException extends BadRequestException {
    public MustacheException(String correlationId, String code, String message, int line, int column) {
        super(
                correlationId,
                code,
                line != 0 || column != 0 ? message + " at line " + line + " and column " + column : message
        );
    }
}
