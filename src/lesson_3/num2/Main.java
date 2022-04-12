package lesson_3.num2;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<TelephoneDirectory> telephoneDirectory = new ArrayList<>(Arrays.asList(
                new TelephoneDirectory("Сидоров", "79035483489"),
                new TelephoneDirectory("Петров", "79335453439"),
                new TelephoneDirectory("Забойченко", "79434487440"),
                new TelephoneDirectory("Кириллов", "79633480000"),
                new TelephoneDirectory("Петров", "79736344589"),
                new TelephoneDirectory("Фёдоров", "79035483489"),
                new TelephoneDirectory("Сидоров", "79006782348")
        ));

        System.out.println(telephoneDirectory.toString() + "\n");
        telephoneDirectory.add(new TelephoneDirectory("Семёнов", "7934435432"));
        System.out.println(telephoneDirectory.toString() + "\n");

        String lastnameForSearch = "Сидоров";
        System.out.println("Номер(-а) телефона(-в), записанный(-ых) на фамалию " + lastnameForSearch + ":");
        for (TelephoneDirectory entry :
                telephoneDirectory) {

            if (lastnameForSearch.equals(entry.getLastname()))
                System.out.println(entry.getNumber());
        }
    }
}
