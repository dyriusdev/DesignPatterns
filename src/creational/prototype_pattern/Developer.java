package creational.prototype_pattern;

public class Developer implements IEmployee {

    public int wordsPerMinute;
    public String name, role, preferredLanguage;

    @Override
    public String GetDetails() {
        return String.format("%s - %s - %s", name, role, preferredLanguage);
    }
}