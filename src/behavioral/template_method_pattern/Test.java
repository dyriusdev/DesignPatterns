package behavioral.template_method_pattern;

public class Test {

    public static void main(String[] args) {
        System.out.println("Same client code can work with different subclasses:");
        Client.ClientCode(new ConcreteClassA());
        System.out.println("ame client code can work with different subclasses:");
        Client.ClientCode(new ConcreteClassB());
    }
}