package Task_2;

public class FigureGeometry {
    String name;
    String colorBorder;
    String colorInside;

    double sideA;
    double sideB;
    double sideC;

    public FigureGeometry(String name, String colorBorder, String colorInside) {
        this.name = name;
        this.colorBorder = colorBorder;
        this.colorInside = colorInside;
        sideA = 0;
        sideB = 0;
        sideC = 0;
    }
}