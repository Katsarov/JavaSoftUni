package ExamplesMethodsLab;

import java.util.Scanner;

public class PrintingTriangle_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        printIncreasingNumbers(number);
        printDecreasingNumbers(number);
    }

    private static void printDecreasingNumbers(int length) {
        for (int i = length - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if(j < length){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printIncreasingNumbers(int length) {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if(j < length){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
