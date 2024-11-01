package creational.singleton_pattern;

public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {}



    public static EagerInitializedSingleton GetInstance() {
        return instance;
    }
}