package behavioral.mediator_pattern;

public class ConcreteColleagueB extends Colleague {

    public ConcreteColleagueB(IMediator mediator) {
        super(mediator);
    }

    public void Send(String msg) {
        System.out.println("B send a message : " + msg);
        mediator.SendMessage(this, msg);
    }

    public void Receive(String msg) {
        System.out.println("Receiving : " + msg);
    }
}