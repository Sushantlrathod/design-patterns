package creationalDesignPattern.abstractFactory;

public class AbstractFactoryProduct {

    public AbstractFactory getInstanceOfCarFactory(String name) {

        if (name.equals("premium"))
            return new PremiumCarFactory();
        else if (name.equals("economy"))
            return new EconomicalCarFactory();
        else
            return null;
    }

}
