package NestedLoops.Lab;

import java.util.Scanner;

public class SumOfTwoNumbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int count = 0;
        boolean isFound = false;

        for (int i = n1; i <= n2; i++) {
            for (int j = n1; j <= n2; j++) {
                count++;
                if(i + j == magicNumber){
                    System.out.printf("Combination N:%d ", count);
                    System.out.printf("(%d + %d = %d)\n", i, j, i + j);
                    isFound = true;
                    break;
                }
            }
            if(isFound){
                break;
            }
        }
        if(!isFound){
            System.out.printf("%d combinations - neither equals %d", count, magicNumber);
        }
    }
}
