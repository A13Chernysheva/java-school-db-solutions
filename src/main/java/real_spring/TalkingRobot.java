package real_spring;

import lombok.Setter;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class TalkingRobot {

    @InjectRandomName
    private String name;

    @Setter
    private List<Quoter> quoters;

    @PostConstruct
    public void talk(){
        System.out.println("My name is" + name);
        quoters.forEach(Quoter::sayQuote);
    }
}
