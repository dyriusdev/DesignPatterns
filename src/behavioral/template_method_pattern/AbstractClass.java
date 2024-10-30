package behavioral.template_method_pattern;

public abstract class AbstractClass {

    public void TemplateMethod() {
        BaseOperation1();
        RequiredOperations1();
        BaseOperation2();
        Hook1();
        RequiredOperations2();
        BaseOperation3();
        Hook2();
    }

    protected void BaseOperation1() {
        System.out.println("AbstractClass says: I am doing the bulk of the work");
    }

    protected void BaseOperation2() {
        System.out.println("AbstractClass says: But I let subclasses override some operations");
    }

    protected void BaseOperation3() {
        System.out.println("AbstractClass says: But I am doing the bulk of the work anyway");
    }

    protected abstract void RequiredOperations1();

    protected abstract void RequiredOperations2();

    protected abstract void Hook1();

    protected abstract void Hook2();
}