package behavioral.interpreter_pattern;

public class Client {

    public void BuildAndInterpretCommands() {
        Context context = new Context("Java Context");
        NonTerminalExpression root = new NonTerminalExpression();
        root.expression1 = new TerminalExpression();
        root.expression2 = new TerminalExpression();
        root.Interpret(context);
    }
}