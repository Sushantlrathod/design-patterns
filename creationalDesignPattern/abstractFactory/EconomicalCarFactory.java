package creationalDesignPattern.abstractFactory;

public class EconomicalCarFactory implements AbstractFactory {

    @Override
    public Car getInstance(int price) {

        if (price == 200000)
            return new Economical_1();
        else if (price == 250000)
            return new Economical_2();
        else
            return null;
    }

}
