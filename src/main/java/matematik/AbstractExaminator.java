package matematik;

import matematik.exercise.Exercise;
import matematik.exercise.ExerciseComputer;
import matematik.exercise.exercise_checkers.ResultExerciseChecker;
import matematik.teachers.Teacher;

import java.util.ArrayList;
import java.util.List;

public class AbstractExaminator implements Examinator{

    Teacher teacher;
    ResultExerciseChecker resultExerciseChecker;
    ExerciseComputer exerciseComputer;

    AbstractExaminator(Teacher teacher) {
        this.teacher = teacher;
        resultExerciseChecker = new ResultExerciseChecker(teacher.getVariableRequirements());
        exerciseComputer = new ExerciseComputer();
    }

    @Override
    public Exercise generate() {
        Exercise exercise;
        do {
            exercise = Exercise.builder()
                    .a(teacher.getVariableRequirements().getRandomVariable())
                    .b(teacher.getVariableRequirements().getRandomVariable())
                    .operation(teacher.getOperationRequirements().getRandomOperation())
                    .answer(0)
                    .build();
            exercise = exerciseComputer.compute(exercise);
        } while (! resultExerciseChecker.check(exercise));
        return exercise;
    }

    @Override
    public List<Exercise> generate(int num) {
        List<Exercise> list = new ArrayList<>();
        for(int i = 0; i < num; i++) {
            list.add(generate());
        }
        return list;
    }
}
