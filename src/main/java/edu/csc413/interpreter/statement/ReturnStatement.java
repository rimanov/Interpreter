package edu.csc413.interpreter.statement;

import edu.csc413.interpreter.ProgramState;

public class ReturnStatement implements Statement{
    String expressionAsString;

    public ReturnStatement(String expressionAsString){
        this.expressionAsString = expressionAsString;
    }

    @Override
    public void run(ProgramState programState){
            programState.setReturnValue(Integer.parseInt(expressionAsString));
    }
}
