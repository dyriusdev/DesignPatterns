package creational.builder_pattern;

public class VehicleCreator {

    private final IVehicleBuilder builder;

    public VehicleCreator(IVehicleBuilder build) {
        builder = build;
    }

    public void CreateVehicle() {
        builder.SetModel();
        builder.SetEngine();
        builder.SetBody();
        builder.SetTransmission();
        builder.SetAccessories();
    }

    public Vehicle GetVehicle() {
        return builder.GetVehicle();
    }
}