package stream.lab1;

import stream.lab1.Employee;

import java.util.List;

public class EmployeeUtils {

    public static int totalSalary(List<Employee> employees) {
        return employees.stream()
                .mapToInt(Employee::getSalary)
                .sum();
    }

}
