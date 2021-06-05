package edu.csc413.interpreter.expression;

import edu.csc413.interpreter.ProgramState;

/** Expression type that represents a reference to a variable that can be evaluated to an integer. */
public class VariableExpression implements Expression {
    private String variableName;

    public VariableExpression(String variableName) {
        this.variableName = variableName;
    }

    @Override
    public int evaluate(ProgramState programState) {
        return programState.getVariable(variableName);
    }
}
