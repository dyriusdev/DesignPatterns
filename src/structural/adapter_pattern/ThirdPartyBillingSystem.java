package structural.adapter_pattern;

import java.util.List;

public class ThirdPartyBillingSystem {

    private final ITarget employeeSource;

    public ThirdPartyBillingSystem(ITarget source) {
        employeeSource = source;
    }

    public void Show() {
        List<String> employee = employeeSource.GetEmployeeList();
        System.out.println("=- Employee List -=");
        for (String name : employee) {
            System.out.println(name);
        }
    }
}