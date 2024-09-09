package Task_2;

public class Circle extends FigureGeometry implements SquareAndPerimeterCalc {
    String id = "Круг";

    public double getSideA() {
        return this.sideA;
    }

    public double getSideB() {
        return this.sideB;
    }

    public double getSideC() {
        return this.sideC;
    }

    public Circle(String name, String colorBorder, String colorInside, double sideA) {
        super(name, colorBorder, colorInside);
        this.sideA = sideA;
    }

    public double calcPerim() {

        return Math.round(2 * Math.PI * sideA);
    }
}
