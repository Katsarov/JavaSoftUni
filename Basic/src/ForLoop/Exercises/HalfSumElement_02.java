package ForLoop.Exercises;

import java.util.Scanner;

public class HalfSumElement_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int numMax = Integer.MIN_VALUE;
        int sumNumbers = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sumNumbers += num;
            if (num > numMax) {
                numMax = num;
            }
        }

        int netSum = sumNumbers - numMax;
        if (netSum == numMax) {
            System.out.printf("Yes\nSum = %d", numMax);
        } else {
            System.out.printf("No\nDiff = %d", Math.abs(netSum - numMax));
        }
    }
}
