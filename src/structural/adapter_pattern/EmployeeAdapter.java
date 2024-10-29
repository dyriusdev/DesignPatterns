package structural.adapter_pattern;

import java.util.ArrayList;
import java.util.List;

public class EmployeeAdapter extends HRSystem implements ITarget {

    @Override
    public List<String> GetEmployeeList() {
        List<String> list = new ArrayList<>();
        String[][] employees = GetEmployees();
        for (String[] employee : employees) {
            if (employee != null) {
                list.add(employee[0]);
                list.add(",");
                list.add(employee[1]);
                list.add(",");
                list.add(employee[2]);
                list.add("\n");
            }
        }
        return list;
    }
}