package behavioral.mediator_pattern;

public class ConcreteColleagueA extends Colleague {

    public ConcreteColleagueA(IMediator mediator) {
        super(mediator);
    }

    public void Send(String msg) {
        System.out.println("A send a message : " + msg);
        mediator.SendMessage(this, msg);
    }

    public void Receive(String msg) {
        System.out.println("Receiving : " + msg);
    }
}