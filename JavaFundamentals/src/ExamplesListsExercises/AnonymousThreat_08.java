package ExamplesListsExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputLine = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("3:1")) {
            String[] data = input.split("\\s+");
            String command = data[0];
            switch (command) {
                case "merge":
                    List<String> result = new ArrayList<>();
                    int startsIndex = Integer.parseInt(data[1]);
                    int endIndex = Integer.parseInt(data[2]);

                    int start = Math.max(startsIndex, 0);
                    int end = Math.min(endIndex, inputLine.size() - 1);

                    // 1. add everything before merge to result list
                    if (start > 0 && start < inputLine.size()) {
                        //result = inputLine.subList(0, start);
                        result.addAll(inputLine.subList(0, start));
                    }

                    // 2. merge elements from start index to edn index
                    if (start < inputLine.size()) {
                        List<String> mergeElements = inputLine.subList(start, end + 1);
                        String merged = "";
                        for (String mergeElement : mergeElements) {
                            merged += mergeElement;
                        }
                        // add the string "merged" to the result list
                        result.add(merged);
                    }

                    // 3. add what is remains of the list
                    if (end + 1 < inputLine.size()){
                        result.addAll(inputLine.subList(end + 1, inputLine.size()));
                    }

                    if (!result.isEmpty()) {
                        inputLine = result;
                    }
                    break;

                case "divide":
                    result = new ArrayList<>();
                    int index = Integer.parseInt(data[1]);
                    int parts = Integer.parseInt(data[2]);

                    String element = inputLine.get(index);

                    if (element.length() % parts == 0) {
                        int symbols = element.length() / parts;
                        // abcdef --> ab cd ef
                        for (int i = 0; i < parts; i++) {
                            // add first element to result list
                            result.add(element.substring(0, symbols));

                            // remove first element from the string
                            element = element.substring(symbols);
                        }
                        inputLine.remove(index);
                        inputLine.addAll(index, result);
                    } else {
                        int symbols = element.length() / parts;
                        // {abcd, efgh, ijkl} -> divide 0 3 --> {a, b, cd, efgh, ijkl}
                        for (int i = 0; i < parts; i++) {
                            if (i == parts - 1) {
                                result.add(element);
                            } else {
                                // add first element to result list
                                result.add(element.substring(0, symbols));

                                // remove first element from the string
                                element = element.substring(symbols);
                            }
                        }
                        inputLine.remove(index);
                        inputLine.addAll(index, result);
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        inputLine.forEach(e -> System.out.print(e + " "));
    }
}
