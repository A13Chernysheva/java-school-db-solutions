package matematik.variable_requirements;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class NonPositiveVariableRequirements extends AbstractVariableRequirements{

    final private int min = Integer.MIN_VALUE + 2;
    final private int max = 0;


}
