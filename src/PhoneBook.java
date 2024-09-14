import java.util.HashMap;

public class PhoneBook {

    private static HashMap<String, String> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public static void addEntry(String number, String lastName) {
        phoneBook.put(number, lastName);
    }

    public static void getEntry(String lastName) {
        for (HashMap.Entry<String, String> entry : phoneBook.entrySet()) {
            if (entry.getValue().equals(lastName)) {
                System.out.println(lastName + " " + entry.getKey());
            }
        }
    }
}