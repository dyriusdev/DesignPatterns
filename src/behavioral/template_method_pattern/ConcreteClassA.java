package behavioral.template_method_pattern;

public class ConcreteClassA extends AbstractClass {

    @Override
    protected void RequiredOperations1() {
        System.out.println("ConcreteClassA says: Implemented Operation1");
    }

    @Override
    protected void RequiredOperations2() {
        System.out.println("ConcreteClassA says: Implemented Operation2");
    }

    @Override
    protected void Hook1() {

    }

    @Override
    protected void Hook2() {

    }
}