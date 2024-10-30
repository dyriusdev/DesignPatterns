package behavioral.strategy_pattern;

public class Context {

    private IStrategy strategy;

    public Context() {}

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void SetStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void GetCustomerPosition(long code) {
        CustomerPositionModel result = strategy.GetCustomerPosition(code);
        System.out.println("Costumer : " + result.name + " - Position : " + result.value);
    }
}