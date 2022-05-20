package org.pipservices3.expressions.mustache.parsers;

/**
 * Define states in mustache lexical analysis.
 */
public enum MustacheLexicalState {
    Value,
    Operator1,
    Operator2,
    Variable,
    Comment,
    Closure
}
