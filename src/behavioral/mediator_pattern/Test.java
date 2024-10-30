package behavioral.mediator_pattern;

public class Test {

    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        mediator.colleagueA = new ConcreteColleagueA(mediator);
        mediator.colleagueB = new ConcreteColleagueB(mediator);
        mediator.SendMessage(mediator.colleagueA, "Mediator 1");
        mediator.SendMessage(mediator.colleagueB, "Mediator 2");
    }
}
