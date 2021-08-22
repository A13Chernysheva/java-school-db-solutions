package matematik.exercise.exercise_checkers;

import lombok.RequiredArgsConstructor;
import matematik.exercise.Exercise;
import matematik.variable_requirements.VariableRequirements;

@RequiredArgsConstructor
public class ResultExerciseChecker implements ExerciseChecker {
    private final VariableRequirements variableRequirements;

    @Override
    public boolean check(Exercise exercise) {
        return variableRequirements.checkVariable(exercise.getAnswer());
    }
}
