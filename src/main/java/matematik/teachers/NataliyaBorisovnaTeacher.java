package matematik.teachers;

import lombok.Getter;
import matematik.Operation;
import matematik.operation_requirements.*;
import matematik.variable_requirements.*;

@Getter
public class NataliyaBorisovnaTeacher implements Teacher{

    final private OperationRequirements operationRequirements;
    final private VariableRequirements variableRequirements;

    public NataliyaBorisovnaTeacher() {
        operationRequirements = new ManuallyManagedOperationRequirements(Operation.getAll());
        variableRequirements = new NonNegativeVariableRequirements();
    }

}
