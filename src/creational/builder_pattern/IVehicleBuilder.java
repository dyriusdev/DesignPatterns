package creational.builder_pattern;

public interface IVehicleBuilder {

    void SetModel();

    void SetEngine();

    void SetTransmission();

    void SetBody();

    void SetAccessories();

    Vehicle GetVehicle();
}