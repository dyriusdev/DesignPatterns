package behavioral.strategy_pattern;

public class Test {

    public static void main(String[] args) {
        Context context = new Context();
        System.out.println("Client:");
        context.SetStrategy(new PositionEquities());
        context.GetCustomerPosition(335962);
        System.out.println("Client:");
        context.SetStrategy(new PositionFunds());
        context.GetCustomerPosition(335962);
    }
}