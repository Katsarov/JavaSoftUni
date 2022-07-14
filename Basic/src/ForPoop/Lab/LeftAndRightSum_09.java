package ForPoop.Lab;

import java.util.Scanner;

public class LeftAndRightSum_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int firstSum = 0;
        int secondSum = 0;
        // Read n numbers for left sum
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            firstSum += number;
        }
        // Read n numbers for right sum
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            secondSum += number;
        }

        if (firstSum == secondSum) {
            System.out.printf("Yes, sum = %d", firstSum);
        } else {
            System.out.printf("No, diff = %d", Math.abs(firstSum - secondSum));
        }
    }
}
