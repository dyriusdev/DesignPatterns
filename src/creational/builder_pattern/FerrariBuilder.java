package creational.builder_pattern;

public class FerrariBuilder implements IVehicleBuilder {
    private final Vehicle object = new Vehicle();

    @Override
    public void SetModel() {
        object.model = "Ferrari 360";
    }

    @Override
    public void SetEngine() {
        object.engine = "4 Stroke";
    }

    @Override
    public void SetTransmission() {
        object.transmission = "280 Km/hr";
    }

    @Override
    public void SetBody() {
        object.body = "Glass Fiber";
    }

    @Override
    public void SetAccessories() {
        object.accessories.add("Seat Cover");
        object.accessories.add("Rear Mirror");
        object.accessories.add("Helmet");
    }

    @Override
    public Vehicle GetVehicle() {
        return object;
    }
}