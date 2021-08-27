package never_use_switch_with_spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class SmsMessageGenerator implements MessageGenerator{

    @Value("sms")
    public String myChannelName;

    @Override
    public String generateMessage(Message message) {
         return message.getChannelName() + " was sent with text: " + message.getContent();
    }

}
