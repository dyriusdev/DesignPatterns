package structural.decorator_pattern;

public abstract class VehicleDecorator implements IVehicle {

    private final IVehicle vehicle;

    public VehicleDecorator(IVehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String Make() { return vehicle.Make(); }

    @Override
    public String Model() { return vehicle.Model(); }

    @Override
    public double Price() { return vehicle.Price(); }
}