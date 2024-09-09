package Task_2;

public interface SquareAndPerimeterCalc {
    double getSideA();
    double getSideB();
    double getSideC();
    default double calcArea() {
        double result;
        if (this.getSideC() > 0) {
            double perim = Math.round((getSideA() + getSideB() + getSideC()) / 2);
            result = Math.round(Math.sqrt(perim * (perim - getSideA()) * (perim - getSideB()) * (perim - getSideC())));
        } else if (this.getSideB() > 0) {
            result = Math.round(getSideA() * getSideA());
        } else {
            result = Math.round(Math.PI * getSideA() * getSideA());
        }
        return result;
    }

    double calcPerim();
}
