package structural.composite_pattern;

public class Circle extends Dot {

    private final int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void Draw() {
        System.out.printf("Draw Circle at : (%s|%s) with radius : %s", x, y, radius);
    }
}