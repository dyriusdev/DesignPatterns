package structural.decorator_pattern;

public class Test {

    public static void main(String[] args) {
        HondaCity car = new HondaCity();
        System.out.println("Honda price : " + car.Price());

        SpecialOffer offer = new SpecialOffer(car);
        offer.discountPercentage = 25;
        offer.offer = "25% Discount";
        System.out.printf("%s @ Honda special price : %s", offer.Price(), offer.offer);
    }
}
