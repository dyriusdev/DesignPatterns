package creational.factory_pattern;

public class Test {

    public static void main(String[] args) {
        VehicleFactory factory = new ConcreteVehicleFactory();

        IFactory scooter = factory.GetVehicle("scooter");
        scooter.Drive(10);

        IFactory bike = factory.GetVehicle("bike");
        bike.Drive(20);
    }
}
