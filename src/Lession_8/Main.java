package Lession_8;
import static Lession_8.EmployeeArray.createArray;

public class Main {
    public static void main(String[] args) {
        Employee unknownEmply = new Employee();
        unknownEmply.printData();
        System.out.println();
        createArray();
        Park.Attraction parkAddAttrn = new Park.Attraction(
                "Скамейка", "9.00 - 19.00", 15);
        System.out.println(parkAddAttrn.info);
        System.out.println(parkAddAttrn.workTime);
        System.out.println(parkAddAttrn.price + "р");
    }
}