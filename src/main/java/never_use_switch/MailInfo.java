package never_use_switch;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MailInfo {
    private MailType mailType;
    private String context;

    void handle() {
        mailType.handle(context);
    }
}
