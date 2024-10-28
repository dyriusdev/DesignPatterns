package creational.singleton_pattern;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

    public static void main(String[] args) {
        EagerInitializedSingleton instanceA = EagerInitializedSingleton.GetInstance();
        EagerInitializedSingleton instanceB = null;

        try {
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                // This destroy the singleton pattern
                constructor.setAccessible(true);
                instanceB = (EagerInitializedSingleton)constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(instanceA.hashCode());
        System.out.println(instanceB.hashCode());
    }
}
