package my_spring;

/**
 * @author Evgeny Borisov
 */
public interface Speaker {
    @Benchmark
    void speak(String message);
}
