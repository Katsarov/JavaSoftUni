package ExamplesAssociativeArraysLab;

import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

public class WordSynonyms_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> wordSynonyms = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            List<String> values = wordSynonyms.get(word);

            if(values != null){
                values.add(synonym);
                wordSynonyms.put(word, values);
            } else {
                values = new ArrayList<>();
                values.add(synonym);
                wordSynonyms.put(word,values);
            }
        }

        for (Map.Entry<String, List<String>> entry : wordSynonyms.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().stream().collect(Collectors.joining(", ")));
        }

    }
}
