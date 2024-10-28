package creational.singleton_pattern;

import java.io.*;

public class SerializedSingletonTest {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        SerializedSingleton instanceA = SerializedSingleton.GetInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("SerializedSingleton.ser"));
        out.writeObject(instanceA);
        out.close();

        // Deserialize from file to object
        ObjectInput input = new ObjectInputStream(new FileInputStream("SerializedSingleton.ser"));
        SerializedSingleton instanceB = (SerializedSingleton)input.readObject();
        input.close();

        System.out.println(instanceA.hashCode());
        System.out.println(instanceB.hashCode());
    }
}