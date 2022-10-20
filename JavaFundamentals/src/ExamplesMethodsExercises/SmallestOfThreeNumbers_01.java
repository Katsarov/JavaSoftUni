package ExamplesMethodsExercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int smallest = smallestOfThreeNumbers(num1, num2, num3);

        System.out.println(smallest);
    }

    private static int smallestOfThreeNumbers(int num1, int num2, int num3) {
        int smallestNumber= Math.min(num3,(Math.min(num1,num2)));

        return smallestNumber;
    }
}
