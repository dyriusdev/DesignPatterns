package behavioral.memento_pattern;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    private final List<IMemento> mementos = new ArrayList<>();
    private final Originator originator;

    public Caretaker(Originator originator) {
        this.originator = originator;
    }

    public void Backup() {
        mementos.add(originator.Save());
    }

    public void Undo() {
        if (mementos.isEmpty()) {
            return;
        }
        IMemento memento = mementos.getLast();
        mementos.remove(memento);
        System.out.println("Caretaker: Restoring state to: " + memento.GetName());
        try {
            originator.Restore(memento);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ShowHistory() {
        System.out.println("Caretaker: Here's the list of mementos:");
        for (IMemento memento : mementos) {
            System.out.println(memento.GetName());
        }
    }
}