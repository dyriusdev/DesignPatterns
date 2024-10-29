package structural.decorator_pattern;

public class SpecialOffer extends VehicleDecorator {

    public int discountPercentage;
    public String offer;

    public SpecialOffer(IVehicle vehicle) {
        super(vehicle);
    }

    @Override
    public double Price() {
        double price = super.Price();
        int percentage = 100 - discountPercentage;
        return Math.round((price * percentage) / 100);
    }
}
