package ExamplesMethodsExercise;

import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        //isPalindrome(input);

        while (!input.equals("END")) {

            String reversed = "";

            for (int j = input.length() - 1; j >= 0; j--) {
                reversed += input.charAt(j);
            }

            if (input.equals(reversed)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

            input = scanner.nextLine();
        }
    }

//    private static boolean isPalindrome(String input) {
//
//    }
}
