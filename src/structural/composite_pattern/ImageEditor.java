package structural.composite_pattern;

import java.util.List;

public class ImageEditor {

    private CompoundGraphic all;

    public void Load() {
        all = new CompoundGraphic();
        all.Add(new Dot(1, 2));
        all.Add(new Circle(5, 3, 10));
    }

    public void GroupSelected(List<IGraphic> graphics) {
        CompoundGraphic group = new CompoundGraphic();
        for (IGraphic graphic : graphics) {
            group.Add(graphic);
        }
        all.Add(group);
        all.Draw();
    }
}