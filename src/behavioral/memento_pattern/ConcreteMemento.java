package behavioral.memento_pattern;

import java.util.Date;

public class ConcreteMemento implements IMemento {

    private String state;
    private Date date;

    public ConcreteMemento(String state) {
        this.state = state;
        date = new Date();
    }

    @Override
    public String GetName() {
        return date + " / " + state.substring(0, 9);
    }

    @Override
    public String GetState() {
        return state;
    }

    @Override
    public Date GetDate() {
        return date;
    }
}