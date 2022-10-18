package ExamplesMethodsExercise;

import java.util.Scanner;

public class PalindromeIntegers_09_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {

            String reversed = "";
            for (int j = input.length() - 1; j >= 0; j--) {
                reversed += input.charAt(j);
            }

            printResult(input, reversed);

            input = scanner.nextLine();
        }
    }

    public static void printResult(String input, String reversed) {

        if (input.equals(reversed)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

