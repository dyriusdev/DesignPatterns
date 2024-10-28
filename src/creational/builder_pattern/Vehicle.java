package creational.builder_pattern;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {

    public String model, engine, transmission, body;
    public List<String> accessories;

    public Vehicle() {
        accessories = new ArrayList<>();
    }

    public void ShowInfo() {
        System.out.printf("Model : %s\nEngine : %s\nBody : %s\nTransmission : %s\nAccessories : %s\n", model, engine, body, transmission, accessories);
    }
}
