package ForPoop.Lab;

import java.util.Scanner;

public class Examples_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int n = Integer.parseInt(scanner.nextLine());
//
//        for (int i = 1; i <= 100 ; i++) {
//            System.out.println(i);
//        }
//
//        for (int i = 200; i >= 100 ; i--) {
//            System.out.println(i);
//        }

        //======================== Text Processing ==============================

//        String text = "SoftUni";
//        int length = text.length();
//
//        System.out.println(length);

        // ========================================================================

        //String text = "SoftUni";
//        char letter = text.charAt(4);
//
//        System.out.println(letter);
        //System.out.println(text.charAt(text.length() - 1));

        //============================================================================

        String text = scanner.nextLine();

        for (int i = 0; i <= text.length() - 1; i++) {
            System.out.println(text.charAt(i));
        }
    }
}
