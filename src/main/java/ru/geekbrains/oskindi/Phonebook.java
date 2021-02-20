package ru.geekbrains.oskindi;

import java.util.HashMap;

public class Phonebook {
    private static HashMap<String, String> phoneNumberList = new HashMap<>();

    public static void add(String surname, String phoneNumber){
        phoneNumberList.put(phoneNumber,surname);
    }
    public static void get(String surname){
        for (HashMap.Entry<String, String> entry : phoneNumberList.entrySet()) {
            if (entry.getValue().equals(surname)) {
                System.out.println(entry.getValue()+": phone number "+ entry.getKey());
            }
        }
    }
}
