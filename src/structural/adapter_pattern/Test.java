package structural.adapter_pattern;

public class Test {

    public static void main(String[] args) {
        ITarget target = new EmployeeAdapter();
        ThirdPartyBillingSystem client = new ThirdPartyBillingSystem(target);
        client.Show();
    }
}