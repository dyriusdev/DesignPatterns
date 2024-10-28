package creational.singleton_pattern;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

    private SerializedSingleton() {}

    private static class SingletonHelper {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton GetInstance() {
        return SingletonHelper.instance;
    }
}