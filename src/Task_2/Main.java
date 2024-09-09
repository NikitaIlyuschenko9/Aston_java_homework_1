package Task_2;

public class Main {
    public static void main(String[] args) {
        Circle figure1 = new Circle("Круг", "Черный", "Черный", 12);
        System.out.println("Фигура " + figure1.id + ":");
        System.out.println("Периметр - " + figure1.calcPerim() + " м");
        System.out.println("Площадь - " + figure1.calcArea() + " м2");
        System.out.println("Цвет границы - " + figure1.colorBorder);
        System.out.println("Цвет заливки - " + figure1.colorInside);
        System.out.println();

        Rectangle figure2 = new Rectangle("Треугольник", "Зеленый", "Жёлтый", 3.2, 4.34);
        System.out.println("Фигура " + figure2.id + ":");
        System.out.println("Периметр - " + figure2.calcPerim() + " м");
        System.out.println("Площадь - " + figure2.calcArea() + " м2");
        System.out.println("Цвет границы - " + figure2.colorBorder);
        System.out.println("Цвет заливки - " + figure2.colorInside);
        System.out.println();

        Triangle figure3 = new Triangle("Треугольник", "Синий", "Оранжевый", 3, 4, 5);
        System.out.println("Фигура " + figure3.id + ":");
        System.out.println("Периметр - " + figure3.calcPerim() + " м");
        System.out.println("Площадь - " + figure3.calcArea() + " м2");
        System.out.println("Цвет границы - " + figure3.colorBorder);
        System.out.println("Цвет заливки - " + figure3.colorInside);
        System.out.println();
    }
}
