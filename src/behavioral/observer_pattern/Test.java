package behavioral.observer_pattern;

public class Test {

    public static void main(String[] args) {
        Subject subject = new Subject();
        ObserverA observerA = new ObserverA();
        subject.Attach(observerA);
        ObserverB observerB = new ObserverB();
        subject.Attach(observerB);
        subject.DoSomething();
        subject.Detach(observerB);
        subject.DoSomething();
    }
}
