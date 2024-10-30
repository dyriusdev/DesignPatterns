package behavioral.state_pattern;

public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
        this.state.SetContext(this);
    }

    public void TransitionTo(State state) {
        System.out.println("Context: Transition to " + state.getClass().getName());
        this.state = state;
        this.state.SetContext(this);
    }

    public void Request1() {
        state.Handle1();
    }

    public void Request2() {
        state.Handle2();
    }
}