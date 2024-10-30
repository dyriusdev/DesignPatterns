package behavioral.strategy_pattern;

public class PositionFunds implements IStrategy {

    @Override
    public CustomerPositionModel GetCustomerPosition(long code) {
        if (code > 0) {
            CustomerPositionModel result = new CustomerPositionModel();
            result.name = "Client " + code;
            result.value = 2000;
            System.out.println(result.name + " - " + result.value);
            return result;
        }
        return new CustomerPositionModel();
    }
}