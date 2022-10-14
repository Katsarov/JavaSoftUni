package ExamplesMethodsExercise;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());

        double numberOne = factorial(n);
        double numberTwo = factorial(m);

        double result = divideTwoFactorials(numberOne, numberTwo);

        System.out.printf("%.2f", result);
    }

    private static double divideTwoFactorials(double numOne, double numTwo) {
        return numOne / numTwo;
    }

    private static double factorial(double number) {
        double num = 1;
        for (int i = 1; i <= number; i++) {
            num = num * i;
        }
        return num;
    }
}
