package matematik.variable_requirements;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class RangeVariableRequirements extends AbstractVariableRequirements{

    private final int min;
    private final int max;

}
