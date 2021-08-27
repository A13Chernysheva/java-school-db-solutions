package never_use_switch_with_spring;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import utils.RandomUtil;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Component
public class DataProducer {

    private static List<String> channels;
    private static Faker faker = new Faker();

    @Value("#{${channel_names}}")
    public void setChannels(List<String> channels) {
        DataProducer.channels = channels;
    }

    public Message generateMessage() {
        return Message.builder()
                .channelName(RandomUtil.getRandomElement(channels))
                .content(faker.chuckNorris().fact())
                .build();
    }
}
