package ExamplesArraysExercises;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] initialArr = scanner.nextLine().split(" ");
        int roratitons = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < roratitons; i++) {
            // take first element
            String firstElement = initialArr[0];

            // shift all elements without first one position to the left
            for (int j = 0; j < initialArr.length - 1; j++) {
                initialArr[j] = initialArr[j + 1];
            }
            // add first element to the last position
            initialArr[initialArr.length - 1] = firstElement;
        }

        System.out.println(String.join(" ", initialArr));
    }
}
