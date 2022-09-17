package ExamplesAssociativeArraysLab;

import java.util.*;
import java.util.stream.Collectors;

public class ExampleMap_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задача --> да се групират думите по техните дължини, във възходящ ред и да се отпечатат
        // Изход:
        // 3 -> bye, the, fox, the, dog
        // 4 -> over, lazy
        // 5 -> hello, quick, brown, jumps

        // Това ни е входа
        List<String> words = Arrays.asList("hello", "bye", "the", "quick", "brown","fox", "jumps", "over", "the", "lazy", "dog");

        // Имаме 1 ключ и много стойности срещу него
        Map<Integer, List<String>> wordsByLength = new TreeMap<>();

        // Трябва да итерираме през words
        for (String word : words) {
            int key = word.length();
            List<String> values = wordsByLength.get(key);
            if(values != null){
                values.add(word);
            } else {
                values = new ArrayList<>();
                values.add(word);
                wordsByLength.put(key, values);
            }
        }

        for (Map.Entry<Integer, List<String>> entry : wordsByLength.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue().stream().collect(Collectors.joining(", ")));
        }
    }
}
