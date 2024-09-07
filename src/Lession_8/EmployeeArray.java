package Lession_8;
public class EmployeeArray {
    public static void createArray() {
        Employee[] arrEmployees = new Employee[5];
        arrEmployees[0] = new Employee("Денис Денисов Денисович", "Бог",
                "bog@gmail.com", "+79527778899", 1000000000, 2000);
        arrEmployees[1] = new Employee("Петр Петров Петрович", "Винчестер",
                "vin4ester@gmail.com", "+79630000000", 4000, 27);
        arrEmployees[2] = new Employee("Александр Александров Александрович", "Разраб",
                "razrab@gmail.com", "+79542221188", 3000, 28);
        arrEmployees[3] = new Employee("Григорий Григорьев Григорьевич", "Кореш по корешам",
                "korew@gmail.coma", "+79219998877", 2700, 30);
        arrEmployees[4] = new Employee("Валерий Валерьев Валерьевич", "Тестер",
                "toster@gmail.com", "+79457775533", 2900, 29);

        for (Employee i : arrEmployees) {
            i.printData();
            System.out.println();
        }
    }
}