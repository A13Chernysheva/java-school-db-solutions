package my_spring;

/**
 * @author Evgeny Borisov
 */
public class ConsoleSpeaker implements Speaker {
    @InjectRandomInt(min=3,max = 5)
    private int volume;
    @Override
    public void speak(String message) {
        System.out.println(message);
    }
}
