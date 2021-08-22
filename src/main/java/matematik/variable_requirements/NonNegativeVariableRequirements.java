package matematik.variable_requirements;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class NonNegativeVariableRequirements extends AbstractVariableRequirements {

    final private int min = 0;
    final private int max = Integer.MAX_VALUE - 1;
}
