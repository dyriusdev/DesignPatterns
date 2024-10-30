package behavioral.memento_pattern;

import java.util.Random;

public class Originator {

    private String state;

    public Originator(String state) {
        this.state = state;
    }

    public void DoSomething() {
        state = GenerateRandomString(30);
    }

    private String GenerateRandomString(int length) {
        String allowedSymbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder result = new StringBuilder();
        while (length > 0) {
            Random random = new Random();
            result.append(allowedSymbols.charAt(random.nextInt(0, allowedSymbols.length())));
            length--;
        }
        return result.toString();
    }

    public IMemento Save() {
        return new ConcreteMemento(this.state);
    }

    public void Restore(IMemento memento) throws Exception {
        if (!(memento instanceof ConcreteMemento)) {
            throw new Exception("Unknown memento class");
        }
        state = memento.GetState();
    }
}