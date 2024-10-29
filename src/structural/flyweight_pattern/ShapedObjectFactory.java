package structural.flyweight_pattern;

import java.util.HashMap;

public class ShapedObjectFactory {

    private final HashMap<String, IShape> shapes = new HashMap<>();

    public int TotalObjectsCreated() {
        return shapes.size();
    }

    public IShape GetShape(String name) {
        IShape shape = null;
        if (shapes.containsKey(name)) {
            shape = shapes.get(name);
        } else {
            switch (name) {
                case "rectangle":
                    shape = new Rectangle();
                    shapes.put(name, shape);
                    break;
                case "circle":
                    shape = new Circle();
                    shapes.put(name, shape);
                    break;
            }
        }
        return shape;
    }
}