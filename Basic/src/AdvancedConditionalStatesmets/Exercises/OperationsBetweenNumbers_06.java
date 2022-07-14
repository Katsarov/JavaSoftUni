package AdvancedConditionalStatesmets.Exercises;

import java.util.Scanner;

public class OperationsBetweenNumbers_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operation = scanner.nextLine();

        if (n2 == 0) {
            System.out.printf("Cannot divide %d by zero", n1);
        } else if (operation.equals("+")) {
            int result = n1 + n2;
            if (result % 2 == 0) {
                System.out.printf("%d %s %d = %d - %s", n1, operation, n2, result, "even");
            } else{
                System.out.printf("%d %s %d = %d - %s", n1, operation, n2, result, "odd");
            }

        } else if (operation.equals("-")) {
            int result = n1 - n2;
            if (result % 2 == 0) {
                System.out.printf("%d %s %d = %d - %s", n1, operation, n2, result, "even");
            } else{
                System.out.printf("%d %s %d = %d - %s", n1, operation, n2, result, "odd");
            }
        } else if (operation.equals("*")) {
            int result = n1 * n2;
            if (result % 2 == 0) {
                System.out.printf("%d %s %d = %d - %s", n1, operation, n2, result, "even");
            } else{
                System.out.printf("%d %s %d = %d - %s", n1, operation, n2, result, "odd");
            }
        } else if (operation.equals("/")) {
            double result = (n1 * 1.0) / n2;
            System.out.printf("%d %s %d = %.2f", n1, operation, n2, result);
        } else if (operation.equals("%")) {
            int result = n1 % n2;
            System.out.printf("%d %s %d = %d", n1, operation, n2, result);
        }
    }
}
