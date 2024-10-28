package creational.builder_pattern;

public class Test {

    public static void main(String[] args) {
        VehicleCreator ferrariCreator = new VehicleCreator(new FerrariBuilder());
        ferrariCreator.CreateVehicle();
        ferrariCreator.GetVehicle().ShowInfo();
        System.out.println("--------------------------------------------------");
        VehicleCreator hondaCreator = new VehicleCreator(new HondaBuilder());
        hondaCreator.CreateVehicle();
        hondaCreator.GetVehicle().ShowInfo();
    }
}
