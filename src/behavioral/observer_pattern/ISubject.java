package behavioral.observer_pattern;

public interface ISubject {

    void Attach(IObserver observer);

    void Detach(IObserver observer);

    void Notify();
}