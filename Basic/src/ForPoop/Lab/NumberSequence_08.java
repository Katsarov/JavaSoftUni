package ForPoop.Lab;

import java.util.Scanner;

public class NumberSequence_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            // Check the min number
            if (number <= minNum){
                minNum = number;
            }
            // Check for max number
            if (number >= maxNum){
                maxNum = number;
            }
        }

        System.out.printf("Max number: %d\n", maxNum);
        System.out.printf("Min number: %d\n", minNum);
    }
}
