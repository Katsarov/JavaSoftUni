package AdvancedConditionalStatesments.Lab;

import java.util.Scanner;

public class NumberInRange_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

//        if (number >= -100 && number <= 100){
//            if (number == 0){
//                System.out.println("No");
//            } else {
//                System.out.println("Yes");
//            }
//        } else {
//            System.out.println("No");
//        }

        if(number >= -100 && number <= 100 && number != 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
