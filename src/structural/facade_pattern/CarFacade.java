package structural.facade_pattern;

public class CarFacade {

    private final CarModel model;
    private final CarEngine engine;
    private final CarBody body;
    private final CarAccessories accessories;

    public CarFacade() {
        model = new CarModel();
        engine = new CarEngine();
        body = new CarBody();
        accessories = new CarAccessories();
    }

    public void Create() {
        System.out.println("=- Creating car -=");
        model.SetModel();
        engine.SetEngine();
        body.SetBody();
        accessories.SetAccessories();
        System.out.println("=- Car creation complete -=");
    }
}