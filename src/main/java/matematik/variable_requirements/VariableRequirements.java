package matematik.variable_requirements;

public interface VariableRequirements {

    int min = 0;
    int max = 0;

    int getRandomVariable();
    boolean checkVariable(int variable);
}
