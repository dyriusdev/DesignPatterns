package creational.factory_pattern;

public class Bike implements IFactory {

    @Override
    public void Drive(int miles) {
        System.out.printf("Drive the bike : %s km\n", miles);
    }
}
