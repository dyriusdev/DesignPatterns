package behavioral.observer_pattern;

public class ObserverA implements IObserver {

    @Override
    public void Update(ISubject subject) {
        if ((subject instanceof Subject) && ((Subject)subject).state < 3) {
            System.out.println("ObserverA: Reacted to the event.");
        }
    }
}