package matematik.operation_requirements;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import matematik.Operation;
import utils.RandomUtil;

import java.util.Arrays;

@NoArgsConstructor
public abstract class AbstractOperationRequirements implements OperationRequirements{
    private Operation[] operations = null;
    private static RandomUtil random = new RandomUtil();

    abstract Operation[] getOperations();

    @Override
    public Operation getRandomOperation() {
        return  random.getRandomElement(Arrays.asList(getOperations().clone()));
    }
}
