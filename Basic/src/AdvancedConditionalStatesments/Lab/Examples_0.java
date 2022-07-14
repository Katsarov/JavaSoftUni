package AdvancedConditionalStatesments.Lab;

import java.util.Scanner;

public class Examples_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        boolean isValid = (num > 10) && (num % 2 == 0);
        if (!isValid){
            System.out.println("Invalid!");
        } else {
            System.out.println("Great result!!!");
        }
    }
}
