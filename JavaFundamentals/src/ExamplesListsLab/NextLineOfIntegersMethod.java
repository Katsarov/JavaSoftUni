package ExamplesListsLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NextLineOfIntegersMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = nextLineOfInts(scanner);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }

    private static List<Integer> nextLineOfInts(Scanner scanner) {
        List<Integer> numbers = new ArrayList<>();

        String input = scanner.nextLine();
        String[] splittedInput = input.split(" ");

        for (int i = 0; i < splittedInput.length; i++) {
            numbers.add(Integer.parseInt(splittedInput[i]));
        }
        return numbers;
    }
}
