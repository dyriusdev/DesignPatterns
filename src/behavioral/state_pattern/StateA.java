package behavioral.state_pattern;

public class StateA extends State {

    @Override
    public void Handle1() {
        System.out.println("StateA handles request1");
        System.out.println("StateA wants to change the state of the context.");
        context.TransitionTo(new StateB());
    }

    @Override
    public void Handle2() {
        System.out.println("StateA handles request2");
    }
}