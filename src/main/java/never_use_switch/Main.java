package never_use_switch;

import com.github.javafaker.Faker;
import utils.RandomUtil;
import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public class Main {

    @SneakyThrows
    public static void main(String[] args) {
        MailSender mailSender = new MailSender();
        Faker faker = new Faker();
        while (true) {
            MailInfo mailInfo = MailInfo.builder()
                    .context(faker.chuckNorris().fact())
                    .mailType(RandomUtil.getRandomElement(MailType.getAll()))
                    .build();

            mailSender.send(mailInfo);
            Thread.sleep(2000);

        }
    }
}
