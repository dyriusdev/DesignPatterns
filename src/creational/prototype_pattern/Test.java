package creational.prototype_pattern;

public class Test {

    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.name = "1";
        dev.role = "TI";
        dev.preferredLanguage = "Java";
        System.out.println(dev.GetDetails());

        Manager manager = new Manager();
        manager.name = "3";
        manager.role = "Manager";
        manager.wordsPerMinute = 120;
        System.out.println(manager.GetDetails());
    }
}
