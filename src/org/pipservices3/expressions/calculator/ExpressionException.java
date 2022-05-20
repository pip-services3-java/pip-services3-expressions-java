package org.pipservices3.expressions.calculator;

import org.pipservices3.commons.errors.BadRequestException;

/**
 * Exception that can be thrown by Expression Calculator.
 */
public class ExpressionException extends BadRequestException {
    public ExpressionException(String correlationId, String code, String message, int line, int column) {
        super(
                correlationId,
                code,
                line != 0 || column != 0 ? message + " at line " + line + " and column " + column : message
        );
    }

    public ExpressionException(String correlationId, String code, String message) {
        this(correlationId, code, message, 0, 0);
    }
}
