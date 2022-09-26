package ExamplesListsLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = nextLineOfInts(scanner);

        // 8 2 2 4 8 16
        List<Integer> nextNumber = sumAdjacentEqualNumbers(numbers);
        while (nextNumber.size() != numbers.size()) {
            numbers = nextNumber;
            nextNumber = sumAdjacentEqualNumbers(numbers);
        }


        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    private static List<Integer> sumAdjacentEqualNumbers(List<Integer> numbers) {
        List<Integer> nextNumber = new ArrayList<>();
        int i = 0;
        while (i < numbers.size()) {
            if (i < numbers.size() - 1 && numbers.get(i) == numbers.get(i + 1)) {
                nextNumber.add(numbers.get(i) + numbers.get(i + 1));
                i+=2;
            } else {
                nextNumber.add(numbers.get(i));
                i++;
            }
        }
        return nextNumber;
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
