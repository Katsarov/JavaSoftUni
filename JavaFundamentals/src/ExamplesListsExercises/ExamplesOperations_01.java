package ExamplesListsExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExamplesOperations_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Операциите, които мовем да правим с листове са:
        // add  remove  set

        // Peter Nikolay Kaloyan

        // String array
        String[] names = {"Peter", "Nikolay", "Kaloyan"};   // Variant 1

        String[] names2 = new String[3]; // Variant 2


        // Lists array
        List<String> namesList = new ArrayList<>(); // Variant 1
        namesList.add("Peter");
        namesList.add("Nikolay");
        namesList.add("Kaloyan");

        List<String> nameList2 = new ArrayList<>(Arrays.asList("Peter", "Nikolay", "Kaloyan")); // Variant 2
        nameList2.set(1, "Toto");
        nameList2.set(nameList2.size() - 1, "Miro");

        System.out.println();
    }
}
