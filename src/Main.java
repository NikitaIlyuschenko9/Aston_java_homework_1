public class Main {
    public static void main(String[] args) {

        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.addEntry("8-911-462-75-25", "Гагарин");
        myPhoneBook.addEntry("8-911-753-12-36", "Терешкова");
        myPhoneBook.addEntry("8-911-159-45-69", "Пушкин");
        myPhoneBook.addEntry("8-911-789-78-58", "Пушкин");
        myPhoneBook.addEntry("8-911-456-96-47", "Гагарин");
        myPhoneBook.addEntry("8-911-123-63-14", "Гагарин");

        myPhoneBook.getEntry("Гагарин");
        myPhoneBook.getEntry("Пушкин");

    }
}