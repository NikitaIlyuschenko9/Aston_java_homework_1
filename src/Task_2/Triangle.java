package Task_2;

public class Triangle extends FigureGeometry implements SquareAndPerimeterCalc {
    String id = "Треугольник";

    public double getSideA() {
        return this.sideA;
    }

    public double getSideB() {
        return this.sideB;
    }

    public double getSideC() {
        return this.sideC;
    }

    public Triangle(String name, String colorBorder, String colorInside, double sideA, double sideB, double sideC) {
        super(name, colorBorder, colorInside);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double calcPerim() {

        return sideA + sideB + sideC;

    }
}