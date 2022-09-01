package Examples;

import java.util.Scanner;
import java.util.Arrays;


public class CondenseArrayToNumber_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        if(numbers.length == 1){
            System.out.printf("%d is already condensed to number", numbers[0]);
            return;
        }

        int sumElements = 0;

        while (numbers.length > 1){
            int [] condense = new int[numbers.length - 1];
            for (int i = 0; i < numbers.length - 1; i++) {
                condense[i] = numbers[i] + numbers[i + 1];
            }
            numbers = condense;
        }

        for (int number : numbers) {
            sumElements += number;
        }

        System.out.print(sumElements);
    }
}
