package structural.composite_pattern;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();
        editor.Load();

        List<IGraphic> graphics = new ArrayList<>();
        graphics.add(new Circle(10, 5, 2));
        graphics.add(new Dot(20, 15));
        editor.GroupSelected(graphics);
    }
}