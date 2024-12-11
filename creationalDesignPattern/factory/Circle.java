package creationalDesignPattern.factory;

public class Circle implements Shape {

    @Override
    public void computeArea() {
        System.out.println("Drawing a circle");
    }
}