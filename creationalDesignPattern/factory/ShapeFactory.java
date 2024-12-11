package creationalDesignPattern.factory;

public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equals("Circle"))
            return new Circle();
        else if (shapeType.equals("Rectangle"))
            return new Rectangle();
        else if (shapeType.equals("squre"))
            return new Square();
        else
            return null;
    }
}