package never_use_switch_with_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Evgeny Borisov
 */

public class Main {
    static AnnotationConfigApplicationContext context;

    public static void main(String[] args) throws InterruptedException {
        context = new AnnotationConfigApplicationContext(Config.class);
        MessageDistributor distributor = context.getBean(MessageDistributor.class);
        DataProducer dataProducer = context.getBean(DataProducer.class);

        while (true) {
            Message message = dataProducer.generateMessage();
            distributor.distribute(message);
            Thread.sleep(500);
        }
    }
}
