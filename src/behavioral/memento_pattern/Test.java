package behavioral.memento_pattern;

public class Test {

    public static void main(String[] args) {
        Originator originator = new Originator("Super-Memento");
        Caretaker caretaker = new Caretaker(originator);
        caretaker.Backup();
        originator.DoSomething();
        caretaker.Backup();
        originator.DoSomething();
        caretaker.Backup();
        originator.DoSomething();

        caretaker.ShowHistory();
        System.out.println("Client: Now, let's rollback!\n");
        caretaker.Undo();
        System.out.println("Client: Now, let's rollback!\n");
        caretaker.Undo();
    }
}