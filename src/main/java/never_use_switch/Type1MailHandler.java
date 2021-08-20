package never_use_switch;

public class Type1MailHandler implements MailHandler{
    public void handle(String context) {
        //50 lines of code which send welcome mail
        System.out.println("Welcome mail was sent "+ context);
    }
}
