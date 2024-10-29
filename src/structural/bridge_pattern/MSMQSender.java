package structural.bridge_pattern;

public class MSMQSender implements IMessageSender {

    @Override
    public void Send(String subject, String body) {
        System.out.printf("MSMQ\n%s\n%s\n", subject, body);
    }
}