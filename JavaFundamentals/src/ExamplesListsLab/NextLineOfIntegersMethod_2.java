package ExamplesListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NextLineOfIntegersMethod_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> items = getStrings(scanner);

        for (int item : items) {
            System.out.println(item);
        }

    }

    private static List<Integer> getStrings(Scanner scanner) {
        String input = scanner.nextLine();

        List<Integer> items = Arrays.stream(input.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        return items;
    }
}
