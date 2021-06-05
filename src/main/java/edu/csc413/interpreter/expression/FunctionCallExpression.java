package edu.csc413.interpreter.expression;

import edu.csc413.interpreter.ProgramState;
import edu.csc413.interpreter.statement.Statement;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class FunctionCallExpression implements Expression{
    private String functionName;
    private List<String> parameterValuesAsStrings;

    public FunctionCallExpression(String functionName, List<String> parameterValuesAsStrings){
        this.functionName = functionName;
        this.parameterValuesAsStrings = parameterValuesAsStrings;
    }

    @Override
    public int evaluate(ProgramState programState){
        Stack<HashMap<List<String>, List<String>>> stackFrame = new Stack<>();
        programState.getFunctionStatements(functionName);
        programState.getParameterNames(functionName);
        stackFrame.peek().put(programState.getParameterNames(functionName), parameterValuesAsStrings);
        return 0;
    }
}
