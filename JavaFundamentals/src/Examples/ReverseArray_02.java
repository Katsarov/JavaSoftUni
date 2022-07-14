package Examples;

import java.util.Scanner;

public class ReverseArray_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the line
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
//            System.out.printf("%d ", numbers[i]);
//        }

        // ======================= Reversed Printing =================================================
        // 2. Принтиране на числата в обратен ред
        // Правим си един цикъл, който въртим до средата му numbers.length / 2
        for (int i = 0; i < numbers.length / 2; i++) {

            // ще разменим индекса на числото 1 с индекса на числото 5; след това индекса на числото 2 с индекса на числото 4; и 3 ще си остане на същото място
            int otherIndex = numbers.length - 1 - i;   // по този начин при шсяко завъртане ще намаляваме индекса с 'i'
            // на първа итерация: 5 - 1 - 0 = 4
            // на втора итерация: 5 - 1 - 1 = 3

            // Сега ще разменим 2 променливи
            int currentNumber = numbers[i];
            numbers[i] = numbers[otherIndex];
            numbers[otherIndex] = currentNumber;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d ", numbers[i]);
        }
        // резултата е: 55 44 33 22 11
    }
}
