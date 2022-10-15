package ExamplesMethodsExercise;

import java.util.Scanner;

public class MiddleCharacters_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printsMiddleCharacter(input);
    }

    private static void printsMiddleCharacter(String text) {
        if(text.length() % 2 != 0){
            System.out.println(text.charAt(text.length() / 2));
        } else {
            System.out.print(text.charAt(text.length() / 2 - 1));
            System.out.println(text.charAt(text.length() / 2));
        }
    }
}
