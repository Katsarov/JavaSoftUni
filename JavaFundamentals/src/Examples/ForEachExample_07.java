package Examples;

import java.util.Scanner;

public class ForEachExample_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lineOfNumbers = scanner.nextLine();;

        // Split the string by elements into string array
        String [] numbersAsStrings = lineOfNumbers.split("\\s+");

        // Create int array with empty elements
        int [] numbers = new int[numbersAsStrings.length];

        // Iterate through elements, read each element and set it to the position
        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = Integer.parseInt(numbersAsStrings[i]);
        }

        // ========================= Normal Printing ==================================================
        // 1. Нормално принтиране на числата в редица ( 11 22 33 44 55)
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }

        // ======================== ForEach Printing ==================================================
        for (int number : numbers){
            System.out.print(number + " ");
        }
    }
}
