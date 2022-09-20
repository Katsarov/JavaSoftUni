package ExamplesListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Example_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> words = new ArrayList<>(Arrays.asList("abc", "def", "abc", "abc", "def"));

        // Така можем да премахнем първия стринг, който съвпада с думата
        words.remove("abc");    // Ще останат: "def", "abc", "abc", "def"

        // Можем да добавим стринг на точно определена позиция:
        words.add(1, "ShaLaLa");

        System.out.println(words.indexOf("abc"));

        System.out.println(words.contains("Kalin"));

        words.remove(4);


        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
