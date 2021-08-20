package never_use_switch;

import lombok.AllArgsConstructor;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
public enum MailType {
    TYPE1(1, new Type1MailHandler()),
    TYPE2(2, new Type2MailHandler());

    private final int typeNumber;
    public MailHandler typeMailHandler;

    static List<MailType> getAll() {
        return Arrays.asList(values());
    }

    void handle(String context) {
        typeMailHandler.handle(context);
    }
}