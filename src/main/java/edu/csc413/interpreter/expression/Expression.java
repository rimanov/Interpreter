package edu.csc413.interpreter.expression;

import edu.csc413.interpreter.ProgramState;

/**
 * An expression that can be evaluated by the interpreter to an integer value. Expressions may consist of integer
 * constants, references to variables, or combinations of those using arithmetic operators.
 */
public interface Expression {
    int evaluate(ProgramState programState);
}
