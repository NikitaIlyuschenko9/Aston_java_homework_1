package Task_2;

public class Rectangle extends FigureGeometry implements SquareAndPerimeterCalc {
    String id = "Прямоугольник";

    public double getSideA() {
        return this.sideA;
    }

    public double getSideB() {
        return this.sideB;
    }

    public double getSideC() {
        return this.sideC;
    }

    public Rectangle(String name, String colorBorder, String colorInside, double sideA, double sideB) {
        super(name, colorBorder, colorInside);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double calcPerim() {

        return (sideA + sideB) * 2;
    }
}