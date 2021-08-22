package matematik.variable_requirements;


import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import utils.RandomUtil;

@NoArgsConstructor
public abstract class AbstractVariableRequirements implements VariableRequirements{

    private static RandomUtil random = new RandomUtil();

    abstract int getMin();
    abstract int getMax();

    public int getRandomVariable() {
        return random.between(getMin(), getMax());
    }

    public boolean checkVariable(int variable) {
        return (getMin() <= variable && variable <= getMax());
    }
}
