package behavioral.observer_pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Subject implements ISubject {

    public int state = 0;

    private List<IObserver> observers = new ArrayList<>();

    @Override
    public void Attach(IObserver observer) {
        System.out.println("Subject: Attached an observer.");
        observers.add(observer);
    }

    @Override
    public void Detach(IObserver observer) {
        observers.remove(observer);
        System.out.println("Subject: Detached an observer.");
    }

    @Override
    public void Notify() {
        System.out.println("Subject: Notifying observers...");
        for (IObserver observer : observers) {
            observer.Update(this);
        }
    }

    public void DoSomething() {
        System.out.println("Subject: I'm doing something important.");
        state = new Random().nextInt(0, 10);
        System.out.println("Subject: My state has just changed to: " + state);
        Notify();
    }
}