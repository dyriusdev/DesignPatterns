package behavioral.state_pattern;

public class StateB extends State {

    @Override
    public void Handle1() {
        System.out.println("StateB handles request1");
    }

    @Override
    public void Handle2() {
        System.out.println("StateB handles request2");
        System.out.println("StateB wants to change the state of the context.");
        context.TransitionTo(new StateA());
    }
}