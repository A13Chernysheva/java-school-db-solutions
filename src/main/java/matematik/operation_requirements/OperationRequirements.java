package matematik.operation_requirements;

import matematik.Operation;

import java.util.Set;

public interface OperationRequirements {
    Set<Operation> operations = null;

    Operation getRandomOperation();
}
