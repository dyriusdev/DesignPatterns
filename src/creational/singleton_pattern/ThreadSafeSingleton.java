package creational.singleton_pattern;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {}


    public static synchronized ThreadSafeSingleton GetInstance() {
        if (instance == null) { instance = new ThreadSafeSingleton(); }
        return instance;
    }
}