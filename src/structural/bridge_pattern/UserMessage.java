package structural.bridge_pattern;

public class UserMessage extends Message {

    public String userComments;

    @Override
    public void Send() {
        String fullBody = String.format("%s\nUser comments : %s", body, userComments);
        sender.Send(subject, fullBody);
    }
}