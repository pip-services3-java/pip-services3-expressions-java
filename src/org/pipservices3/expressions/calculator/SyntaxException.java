package org.pipservices3.expressions.calculator;

import org.pipservices3.commons.errors.BadRequestException;

/**
 * Exception that can be thrown by Expression Parser.
 */
public class SyntaxException extends BadRequestException {
    public SyntaxException(String correlationId, String code,
                           String message, int line, int column) {
        super(
                correlationId,
                code,
                line != 0 || column != 0 ? message + " at line " + line + " and column " + column : message
        );
    }
}
