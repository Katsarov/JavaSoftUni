package ExamplesListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NextLineOfStringsMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> items = getStrings(scanner);

//        for (String item : items) {
//            System.out.println(item);
//        }

        System.out.println(String.join(" ", items));

    }

    private static List<String> getStrings(Scanner scanner) {
        String input = scanner.nextLine();

        List<String> items = Arrays.stream(input.split(" "))
                .collect(Collectors.toList());
        return items;
    }
}
