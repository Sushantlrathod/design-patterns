package creationalDesignPattern.abstractFactory;

public class Main {
    public static void main(String[] args) {

        AbstractFactoryProduct factory = new AbstractFactoryProduct();
        AbstractFactory product = factory.getInstanceOfCarFactory("premium");
        System.out.println(product);
        Car productCar = product.getInstance(600000);
        productCar.speed();

        AbstractFactory product2 = factory.getInstanceOfCarFactory("economy");
        System.out.println(product2);
        Car productCar2 = product2.getInstance(200000);
        productCar2.speed();

    }
}
