package structural.bridge_pattern;

public class Test {

    public static void main(String[] args) {
        IMessageSender email = new EmailSender();
        IMessageSender queue = new MSMQSender();
        IMessageSender web = new WebServiceSender();

        Message message = new SystemMessage();
        message.subject = "Test Message";
        message.body = "This is the test message";

        message.sender = email;
        message.Send();

        message.sender = queue;
        message.Send();

        message.sender = web;
        message.Send();

        UserMessage user = new UserMessage();
        user.subject = "Test message";
        user.body = "Hello! This is the test message";
        user.userComments = "This is just an example";

        user.sender = email;
        user.Send();
    }
}