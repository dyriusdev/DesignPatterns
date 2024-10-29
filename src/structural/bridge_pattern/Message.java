package structural.bridge_pattern;

public abstract class Message {

    public IMessageSender sender;
    public String subject, body;

    public abstract void Send();
}