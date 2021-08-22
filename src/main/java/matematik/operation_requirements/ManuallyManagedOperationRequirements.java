package matematik.operation_requirements;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import matematik.Operation;

@Getter
@RequiredArgsConstructor
public class ManuallyManagedOperationRequirements extends AbstractOperationRequirements{

    private final Operation[] operations;

}
