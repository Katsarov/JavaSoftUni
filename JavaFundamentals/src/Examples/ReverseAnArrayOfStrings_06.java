package Examples;

import java.util.Scanner;

public class ReverseAnArrayOfStrings_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ================ Reverse Strings =======================
        // Input: e de    rrr  a p
        // Output: p a rrr de e

//        String [] arrOfStrings = scanner.nextLine().split("\\s+");
//
//        for (int i = 0; i < arrOfStrings.length / 2; i++) {
//
//            String oldElement = arrOfStrings[i];
//            arrOfStrings[i] = arrOfStrings[arrOfStrings.length - 1 - i];
//            arrOfStrings[arrOfStrings.length - 1 - i] = oldElement;
//
//        }
//        System.out.println(String.join(" ", arrOfStrings));


        // ================ Reverse Integers =======================
        // Input: 3 44    5   99
        // Output: 99 5 44 3
        String [] integers = scanner.nextLine().split("\\s+");

        // Create int array with empty elements
        int [] arrOfIntegers = new int[integers.length];

        // Iterate through all elements from string array, read each element and set it to the position in the integer array
        for (int i = 0; i < integers.length; i++) {
            arrOfIntegers[i] = Integer.parseInt(integers[i]);
        }

        // Правим си един цикъл, който въртим до средата му numbers.length / 2
        for (int i = 0; i < arrOfIntegers.length / 2; i++) {
            int elementIndex = arrOfIntegers.length - 1 - i;

            int oldElement = arrOfIntegers[i];
            arrOfIntegers[i] = arrOfIntegers[elementIndex];
            arrOfIntegers[elementIndex] = oldElement;
        }

        // Printing
        for (int i = 0; i < arrOfIntegers.length; i++) {
            System.out.printf("%d" + " ", arrOfIntegers[i]);
        }
    }
}
