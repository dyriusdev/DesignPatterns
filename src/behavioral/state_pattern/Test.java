package behavioral.state_pattern;

public class Test {

    public static void main(String[] args) {
        Context context = new Context(new StateA());
        context.Request1();
        context.Request2();
    }
}
