package ru.geekbrains.oskindi;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] word = {"Яблоко", "Апельсин", "Яблоко", "Банан", "Манго", "Апельсин", "Апельсин", "Яблоко", "Мандарин", "Мандарин",
                "Арбуз", "Дыня", "Апельсин", "Мандарин", "Помело"};
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < word.length; i++) {
            if (hm.get(word[i]) != null) {
                hm.put(word[i], hm.get(word[i]) + 1);
            } else {
                hm.put(word[i], 1);
            }
        }
        System.out.println(hm);

        Phonebook.add("Ivanov", "88005553535");
        Phonebook.add("Petrov", "89003353535");
        Phonebook.add("Ivanov", "89993993939");
        Phonebook.add("Krasnov", "89956565656");

        Phonebook.get("Ivanov");
    }
}
