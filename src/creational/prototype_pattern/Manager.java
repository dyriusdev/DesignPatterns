package creational.prototype_pattern;

public class Manager implements IEmployee {

    public int wordsPerMinute;
    public String name, role;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String GetDetails() {
        return String.format("%s - %s - %s wpm", name, role, wordsPerMinute);
    }
}