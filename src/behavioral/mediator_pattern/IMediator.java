package behavioral.mediator_pattern;

public interface IMediator {

    void SendMessage(Colleague colleague, String msg);
}