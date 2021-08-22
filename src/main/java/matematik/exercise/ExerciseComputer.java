package matematik.exercise;

import matematik.Operation;

public class ExerciseComputer {

    public Exercise compute(Exercise exercise) {
        int a = exercise.getA();
        int b = exercise.getB();
        Operation operation = exercise.getOperation();
        int answer = operation.compute(a, b);
        return Exercise.builder()
                .a(a)
                .b(b)
                .operation(operation)
                .answer(answer)
                .build();
    }
}
