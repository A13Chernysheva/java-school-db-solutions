package employee_stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
public class Employee {
    String name;
    int salary;
}
