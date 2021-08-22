package matematik.teachers;

import matematik.operation_requirements.OperationRequirements;
import matematik.variable_requirements.VariableRequirements;


public interface Teacher {
    OperationRequirements operationRequirements = null;
    VariableRequirements variableRequirements = null;

    OperationRequirements getOperationRequirements();
    VariableRequirements getVariableRequirements();
}
