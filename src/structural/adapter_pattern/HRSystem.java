package structural.adapter_pattern;

public class HRSystem {

    public String[][] GetEmployees() {
        String[][] employees = new String[4][];
        employees[0] = new String[] {"100", "a", "TI"};
        employees[1] = new String[] {"101", "b", "Manager"};
        return employees;
    }
}