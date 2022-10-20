package ExamplesMethodsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestOfThreeNumbers_01_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        System.out.println(smallestOfThreeNumbers(num1, num2, num3));
    }

    private static int smallestOfThreeNumbers(int n1, int n2, int n3){
        int[] numbers = {n1, n2, n3};
        Arrays.sort(numbers);

        return numbers[0];
    }
}
