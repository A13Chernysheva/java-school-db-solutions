package never_use_switch_with_spring;

import lombok.SneakyThrows;
import org.reflections.Reflections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */
@Component
public class MessageDistributor {

    @Autowired
    private Map<String,MessageGenerator> channelNameTypes;

    public void distribute(Message message) {
        String channelName = message.getChannelName();
        MessageGenerator messageGenerator = channelNameTypes.get(channelName + "MessageGenerator");
        if (messageGenerator == null) {
            throw new UnsupportedOperationException(channelName + " not supported yet");
        }
        String messageToSend = messageGenerator.generateMessage(message);
        System.out.println(messageToSend);
    }

}
