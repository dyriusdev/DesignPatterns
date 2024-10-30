package behavioral.observer_pattern;

public class ObserverB implements IObserver {

    @Override
    public void Update(ISubject subject) {
        if ((subject instanceof Subject) && ((Subject)subject).state < 2) {
            System.out.println("ObserverB: Reacted to the event.");
        }
    }
}