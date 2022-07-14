package ForPoop.Lab;

import java.util.Scanner;

public class LeftAndRightSum_09_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int firstSum = 0;
        int secondSum = 0;

        // Using only one for loop
        for (int i = 0; i < 2*n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (i < n){
                firstSum += number;
            } else {
                secondSum += number;
            }
        }

        if (firstSum == secondSum) {
            System.out.printf("Yes, sum = %d", firstSum);
        } else {
            System.out.printf("No, diff = %d", Math.abs(firstSum - secondSum));
        }
    }
}
