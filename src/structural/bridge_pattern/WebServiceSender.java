package structural.bridge_pattern;

public class WebServiceSender implements IMessageSender {
    @Override
    public void Send(String subject, String body) {
        System.out.printf("Web Service\n%s\n%s\n", subject, body);
    }
}