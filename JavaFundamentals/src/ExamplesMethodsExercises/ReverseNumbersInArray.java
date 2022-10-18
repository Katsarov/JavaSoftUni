package ExamplesMethodsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbersInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        System.out.println(smallestOfThreeNumbers(num1, num2, num3));
    }

    private static int smallestOfThreeNumbers(int n1, int n2, int n3){
        int[] numbers = {n1, n2, n3};

        // Sorting all numbers in an array from smallest to the biggest
        Arrays.sort(numbers);


        // Sorting all numbers from biggest to the smallest one
        for (int i = 0; i <numbers.length / 2 ; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }

        return numbers[0];
    }
}
