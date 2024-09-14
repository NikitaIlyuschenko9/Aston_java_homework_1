import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class WordsList {
    public static void main(String[] args) {
        String[] arrOfWords = {"стрим", "куча", "куча", "массив", "функция", "стек",
                "значение", "данные", "поток", "исключение", "костыль", "утро", "вечер",
                "ночь", "зима", "лето", "весна", "осень", "время", "стек"};

        Set<String> setCollectionBasedArray = new HashSet<>();
        Collections.addAll(setCollectionBasedArray, arrOfWords);

        System.out.println("\nСписок уникальных слов в заданном массиве:\n"  + setCollectionBasedArray);

        HashMap<String, Integer> mapCollectionBasedArray = new HashMap<>();
        for (String e : arrOfWords) {
            mapCollectionBasedArray.put(e, mapCollectionBasedArray.getOrDefault(e, 0) + 1);
        }

        System.out.println("\nКоличество повторений слов в заданном массиве:\n"  + mapCollectionBasedArray);
    }
}
