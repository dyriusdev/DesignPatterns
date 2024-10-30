package behavioral.interpreter_pattern;

public class TerminalExpression implements IExpression {

    @Override
    public void Interpret(Context context) {
        System.out.println("Terminal for " + context.name);
    }
}