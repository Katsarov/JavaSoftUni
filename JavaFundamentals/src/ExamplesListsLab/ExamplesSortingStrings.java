package ExamplesListsLab;

import java.util.*;

public class ExamplesSortingStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> words = new ArrayList<>(Arrays.asList("every", "adult", "dog", "grows", "barks", "eats"));

        // Обръщаме ги в обратен ред
        //Collections.sort(words, (a,b) -> b.compareTo(a));

        Collections.sort(words, (a,b) -> Integer.compare(a.length(), b.length()));
//        for (String word : words) {
//             System.out.printf("%s ", word);
//        }
        System.out.println(String.join(" ", words));

    }
}
