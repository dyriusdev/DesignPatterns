package structural.bridge_pattern;

public class SystemMessage extends Message {

    @Override
    public void Send() {
        sender.Send(subject, body);
    }
}