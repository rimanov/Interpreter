package edu.csc413.interpreter.statement;

import edu.csc413.interpreter.ProgramState;
import edu.csc413.interpreter.expression.Expression;

/** Statement representing a command to print out the integer value of an expression. */
public class PrintStatement implements Statement {
    private Expression expression;

    public PrintStatement(Expression expression) {
        this.expression = expression;
    }

    @Override
    public void run(ProgramState programState) {
        System.out.println(expression.evaluate(programState));
    }
}
