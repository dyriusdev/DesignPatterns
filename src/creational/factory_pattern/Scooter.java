package creational.factory_pattern;

public class Scooter implements IFactory {

    @Override
    public void Drive(int miles) {
        System.out.printf("Drive the scooper : %s km\n", miles);
    }
}
