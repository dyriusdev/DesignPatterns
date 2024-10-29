package structural.bridge_pattern;

public class EmailSender implements IMessageSender {

    @Override
    public void Send(String subject, String body) {
        System.out.printf("Email\n%s\n%s\n", subject, body);
    }
}