package edu.csc413.interpreter.expression;

import edu.csc413.interpreter.ProgramState;

/** Expression type that represents an integer constant value. */
public class ConstantExpression implements Expression {
    private int value;

    public ConstantExpression(int value) {
        this.value = value;
    }

    @Override
    public int evaluate(ProgramState programState) {
        return value;
    }
}
