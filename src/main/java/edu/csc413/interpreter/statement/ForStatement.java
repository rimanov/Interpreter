package edu.csc413.interpreter.statement;

import edu.csc413.interpreter.ProgramState;
import edu.csc413.interpreter.expression.Expression;
import java.util.List;

public class ForStatement extends BlockStatement {
    private List<Statement> body;
    private String loopVariable;
    private Expression rangeStart;
    private Expression rangeEnd;

    public ForStatement(String loopVariable, Expression rangeStart, Expression rangeEnd, List<Statement> body) {
        super(null, body);
        this.loopVariable = loopVariable;
        this.rangeStart = rangeStart;
        this.rangeEnd = rangeEnd;
    }

    @Override
    public void run(ProgramState programState) {
        programState.setVariable(loopVariable, rangeStart.evaluate(programState));
        for(int i = programState.getVariable(loopVariable); i < rangeEnd.evaluate(programState);i++) {
            forBlock(programState);
            programState.setVariable(loopVariable, programState.getVariable(loopVariable)+1);
        }
      }
    }

