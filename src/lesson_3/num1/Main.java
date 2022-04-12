package lesson_3.num1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> listOfFruits = new ArrayList<>();
        listOfFruits.add("Апельсин");
        listOfFruits.add("Яблоко");
        listOfFruits.add("Манго");
        listOfFruits.add("Апельсин");
        listOfFruits.add("Банан");
        listOfFruits.add("Мандарин");
        listOfFruits.add("Персик");
        listOfFruits.add("Яблоко");
        listOfFruits.add("Груша");
        listOfFruits.add("Банан");
        listOfFruits.add("Абрикос");
        listOfFruits.add("Персик");
        listOfFruits.add("Яблоко");

        HashSet<String> uniqueValues = new HashSet<>(listOfFruits);
        System.out.println("Уникальные значения списка фруктов\n" + uniqueValues + "\n");

        for (String value :
                uniqueValues) {

            int count = 0;
            Iterator<String> iterator = listOfFruits.iterator();

            while (iterator.hasNext()) {
                if (iterator.next().equals(value)) count++;
            }
            System.out.println("Кол-во записей \"" + value + "\": " + count);
        }
    }
}
