package ExamplesListsLab;

import java.util.ArrayList;
import java.util.List;

public class ExampleLists_00 {
    public static void main(String[] args) {
        // създаване на нов празен лист
        List<String> words = new ArrayList<String>();

        // добавяне на елементи в листа
        words.add("swedish");
        words.add("vegans");
        words.add("marching");
        words.add("ashore");

        //words.remove("ashore");     // Ще премахне думата ashore
        //words.remove(1);            // Ще премахне думата с индекс 1 ==> vegans

        // отпечатване на първата дума --> swedish
       // System.out.println(words.get(0));

        // преименуване на първата дума --> swedish ==> kilimandjaro
        words.set(0, "kilimandjaro");
        //System.out.println(words.get(0));
        //System.out.println();

        // Извеждане на субстринг
        List<String> someWords = words.subList(0,2);
        //someWords.clear();

        // обхождане на листа и отпечатване на всички думи, всяка на нов ред
        for (int i = 0; i < someWords.size(); i++) {
            System.out.println(someWords.get(i));
        }
    }
}
