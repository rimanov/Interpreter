package edu.csc413.interpreter.statement;

import edu.csc413.interpreter.ProgramState;
import edu.csc413.interpreter.expression.Expression;

/** Statement representing a command to assign the integer value of an expression to a variable. */
public class AssignStatement implements Statement {
    private String variableName;
    private Expression expression;

    public AssignStatement(String variableName, Expression expression) {
        this.variableName = variableName;
        this.expression = expression;
    }

    @Override
    public void run(ProgramState programState) {
        int expressionValue = expression.evaluate(programState);
        programState.setVariable(variableName, expressionValue);
    }
}
