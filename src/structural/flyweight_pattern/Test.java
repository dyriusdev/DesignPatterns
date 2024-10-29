package structural.flyweight_pattern;

public class Test {

    public static void main(String[] args) {
        ShapedObjectFactory factory = new ShapedObjectFactory();

        IShape shape = factory.GetShape("rectangle");
        shape.Print();
        shape = factory.GetShape("rectangle");
        shape.Print();

        shape = factory.GetShape("circle");
        shape.Print();
        shape = factory.GetShape("circle");
        shape.Print();

        int total = factory.TotalObjectsCreated();
        System.out.println("Total of objects created : " + total);
    }
}
