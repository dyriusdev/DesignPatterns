package creational.factory_pattern;

public class ConcreteVehicleFactory extends VehicleFactory {

    @Override
    public IFactory GetVehicle(String vehicle) {
        return switch (vehicle) {
            case "scooter" -> new Scooter();
            case "bike" -> new Bike();
            default -> null;
        };
    }
}
