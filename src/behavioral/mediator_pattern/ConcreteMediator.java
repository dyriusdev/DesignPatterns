package behavioral.mediator_pattern;

public class ConcreteMediator implements IMediator {

    public ConcreteColleagueA colleagueA;
    public ConcreteColleagueB colleagueB;

    @Override
    public void SendMessage(Colleague colleague, String msg) {
        if (colleague == colleagueA) {
            colleagueB.Receive(msg);
        } else {
            colleagueA.Receive(msg);
        }
    }
}