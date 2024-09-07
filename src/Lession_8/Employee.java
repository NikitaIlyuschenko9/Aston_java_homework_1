package Lession_8;
public class Employee {
    public String fullName;
    public String position;
    public String email;
    public String telephoneNumber;
    public int salary;
    public int age;

    public Employee(String fullName, String position, String email, String telNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.telephoneNumber = telNumber;
        this.salary = salary;
        this.age = age;
    }

    public Employee() {
        fullName = "Петров Петр Петрович";
        position = "Гений";
        email = "javarush@gmail.com";
        telephoneNumber = "+779778776";
        salary = 2000;
        age = 33;
    }

    public void printData() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Электронная почта: " + email);
        System.out.println("Телефон: " + telephoneNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }
}