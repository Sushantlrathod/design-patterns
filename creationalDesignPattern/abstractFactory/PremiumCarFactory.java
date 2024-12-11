package creationalDesignPattern.abstractFactory;

public class PremiumCarFactory implements AbstractFactory {

    @Override
    public Car getInstance(int price) {
        if (price == 500000)
            return new Premium_1();
        else if (price == 600000)
            return new Premiuam_2();
        else
            return null;

    }

}
