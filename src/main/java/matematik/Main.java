package matematik;

import matematik.exercise.Exercise;
import matematik.teachers.NataliyaBorisovnaTeacher;
import matematik.teachers.Teacher;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Examinator examinator = new AbstractExaminator(new NataliyaBorisovnaTeacher());
        List<Exercise> exercise = examinator.generate(10);
        exercise.forEach(System.out::println);
    }
}
