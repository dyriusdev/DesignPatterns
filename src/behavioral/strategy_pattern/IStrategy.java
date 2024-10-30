package behavioral.strategy_pattern;

public interface IStrategy {

    CustomerPositionModel GetCustomerPosition(long code);
}