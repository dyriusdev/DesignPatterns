package structural.composite_pattern;

public class Dot implements IGraphic {

    protected int x, y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void Move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void Draw() {
        System.out.printf("Draw Dot at : (%s|%s)", x, y);
    }
}