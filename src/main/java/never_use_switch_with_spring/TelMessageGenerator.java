package never_use_switch_with_spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TelMessageGenerator implements MessageGenerator{

    @Value("tel")
    public String myChannelName;

    @Override
    public String generateMessage(Message message) {
        return message.getChannelName() + " was sent with text: " + message.getContent();
    }
}
