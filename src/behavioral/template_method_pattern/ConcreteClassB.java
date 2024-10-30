package behavioral.template_method_pattern;

public class ConcreteClassB extends AbstractClass {

    @Override
    protected void RequiredOperations1() {
        System.out.println("ConcreteClassB says: Implemented Operation1");
    }

    @Override
    protected void RequiredOperations2() {
        System.out.println("ConcreteClassB says: Implemented Operation2");
    }

    @Override
    protected void Hook1() {
        System.out.println("ConcreteClassB says: Overridden Hook1");
    }

    @Override
    protected void Hook2() {

    }
}