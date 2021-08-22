package matematik;

import matematik.exercise.Exercise;

import java.util.List;


public interface Examinator {
    Exercise generate();
    List<Exercise> generate(int num);
}
