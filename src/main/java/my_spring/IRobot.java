package my_spring;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
//@Benchmark
public class IRobot {
    @InjectByType
    private Speaker speaker;
    @InjectByType
    private Cleaner cleaner;
    @InjectByType
    private RecommendSon recommender;

    @PostConstruct
    public void init() { //todo teach our framework to run all methods which starts with init
        System.out.println(cleaner.getClass());
    }

    public void cleanRoom() {
        speaker.speak("Я начал работать");
        recommender.recommend();
        cleaner.clean();
        recommender.recommend();
        speaker.speak("Я закончил работать");
    }
}
