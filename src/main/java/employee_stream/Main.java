package employee_stream;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee("Alice", 200),
                                                    new Employee("Bob", 100));
        int salary_sum = employeeList.stream().mapToInt(Employee::getSalary).sum();
        System.out.println(salary_sum);
    }
}
