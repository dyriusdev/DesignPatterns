package behavioral.interpreter_pattern;

public class NonTerminalExpression implements IExpression {

    public IExpression expression1, expression2;

    @Override
    public void Interpret(Context context) {
        System.out.println("NonTerminal for " + context.name);
        expression1.Interpret(context);
        expression2.Interpret(context);
    }
}