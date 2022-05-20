package org.pipservices3.expressions.calculator.functions;

import org.pipservices3.expressions.calculator.ExpressionException;
import org.pipservices3.expressions.variants.IVariantOperations;
import org.pipservices3.expressions.variants.Variant;

import java.util.List;

/**
 * Defines a delegate to implement a function
 */
@FunctionalInterface
public interface FunctionCalculator {
    Variant apply(List<Variant> params, IVariantOperations variantOperations) throws ExpressionException;
}
