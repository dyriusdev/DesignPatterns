package structural.composite_pattern;

import java.util.ArrayList;
import java.util.List;

public class CompoundGraphic implements IGraphic {

    private final List<IGraphic> graphics = new ArrayList<>();

    public void Add(IGraphic graphic) { graphics.add(graphic); }

    public void Remove(IGraphic graphic) { graphics.remove(graphic); }

    @Override
    public void Move(int x, int y) {
        for (IGraphic graphic : graphics) {
            graphic.Move(x, y);
        }
    }

    @Override
    public void Draw() {
        for (IGraphic graphic : graphics) {
            graphic.Draw();
        }
    }
}