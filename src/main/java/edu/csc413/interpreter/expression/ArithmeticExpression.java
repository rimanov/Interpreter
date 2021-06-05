package edu.csc413.interpreter.expression;

import edu.csc413.interpreter.ProgramState;

/** Expression representing two other expressions joined by an arithmetic operator. */
public abstract class ArithmeticExpression implements Expression {
    private Expression lhs;
    private Expression rhs;

    public ArithmeticExpression(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    protected int getLhsValue(ProgramState programState) {
        return lhs.evaluate(programState);
    }

    protected int getRhsValue(ProgramState programState) {
        return rhs.evaluate(programState);
    }
}
