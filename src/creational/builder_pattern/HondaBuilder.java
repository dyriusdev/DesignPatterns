package creational.builder_pattern;

public class HondaBuilder implements IVehicleBuilder {

    private final Vehicle object = new Vehicle();

    @Override
    public void SetModel() {
        object.model = "Honda";
    }

    @Override
    public void SetEngine() {
        object.engine = "4 Stroke";
    }

    @Override
    public void SetTransmission() {
        object.transmission = "125 Km/hr";
    }

    @Override
    public void SetBody() {
        object.body = "Plastic";
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