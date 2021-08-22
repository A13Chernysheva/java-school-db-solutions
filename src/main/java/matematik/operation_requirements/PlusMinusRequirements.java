package matematik.operation_requirements;

import lombok.Getter;
import lombok.NoArgsConstructor;
import matematik.Operation;

@Getter
@NoArgsConstructor
public class PlusMinusRequirements extends AbstractOperationRequirements{

    private final Operation[] operations = new Operation[]{Operation.PLUS, Operation.MINUS};

}
