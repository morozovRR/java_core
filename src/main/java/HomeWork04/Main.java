package HomeWork04;



import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> productWord = new HashSet<>();
        productWord.add("Майонез");
        productWord.add("Оливки");
        productWord.add("Колбаса");
        productWord.add("Гречка");
        productWord.add("Рис");
        productWord.add("Масло");
        productWord.add("Арбуз");
        productWord.add("Квас");
        productWord.add("Котлеты");
        productWord.add("Вода");
        productWord.add("Грибы");
        productWord.add("Картофель");
        productWord.add("Сметана");
        productWord.add("Соль");
        productWord.add("Вода");
        productWord.add("Масло");
        productWord.add("Грибы");
        productWord.add("Овсянка");
        productWord.add("Мороженое");
        productWord.add("Майонез");
        System.out.println("Уникальные слова: " + productWord);

        String[] word = {"Майонез", "Оливки", "Колбаса", "Гречка", "Рис", "Масло",
                "Арбуз", "Квас", "Котлеты", "Вода", "Грибы",
                "Картофель", "Сметана", "Соль", "Вода", "Масло",
                "Грибы", "Овсянка", "Мороженое", "Майонез"};

        HashMap<String, Integer> uniqueWords = new HashMap<>();

        for (int i = 0; i < word.length; i++) {
            if (uniqueWords.containsKey(word[i])) {
                uniqueWords.put(word[i], uniqueWords.get(word[i]) + 1);
            } else {
                uniqueWords.put(word[i], 1);
            }
        }

        System.out.println("Повторений слов: " + uniqueWords);

        Main phoneBook = new Main();
        phoneBook.add("Соколов", "9998887766");
        phoneBook.add("Соколов", "9997776655");
        phoneBook.add("Петров", "9996665544");
        phoneBook.add("Харламов", "9995554433");
        phoneBook.add("Харламов", "9994443322");

        System.out.println(phoneBook.get("Харламов"));
        System.out.println(phoneBook.get("Петров"));
        System.out.println(phoneBook.get("Соколов"));




    }

    HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        ArrayList<String> phonesForLastName = phoneBook.getOrDefault(lastName, new ArrayList<>());
        phonesForLastName.add(phoneNumber);
        phoneBook.put(lastName, phonesForLastName);
    }

    public ArrayList<String> get(String lastName) {
        return phoneBook.get(lastName);
    }


}



