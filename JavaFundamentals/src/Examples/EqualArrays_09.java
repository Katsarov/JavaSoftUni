package Examples;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Инициализираме си 2 масива
        int[] firstNumbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(e-> Integer.parseInt(e))
                .toArray();
        int[] secondNumbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        boolean arraysAreEqual;
        int sum = 0;
        int differenceIndex = 0;

        // Сравняваме дали са с еднакви дължини
        if(firstNumbers.length != secondNumbers.length){
            arraysAreEqual = false;
            differenceIndex = Math.min(firstNumbers.length, secondNumbers.length);

        } else {
            arraysAreEqual = true;

            // Ако е вярно, сравняваме първия елемент на единия масив дали е еднакув с първия елемент на другия масив
            for (int i = 0; i < firstNumbers.length; i++) {
                sum += firstNumbers[i];
                if(firstNumbers[i] != secondNumbers[i]){
                    arraysAreEqual = false;
                    differenceIndex = i;
                }
            }
        }
        if(arraysAreEqual){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", differenceIndex);
        }
    }
}
