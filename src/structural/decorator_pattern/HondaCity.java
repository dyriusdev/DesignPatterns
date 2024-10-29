package structural.decorator_pattern;

public class HondaCity implements IVehicle {

    @Override
    public String Make() { return "HondaCity"; }

    @Override
    public String Model() { return "CNG"; }

    @Override
    public double Price() { return 1000000; }
}