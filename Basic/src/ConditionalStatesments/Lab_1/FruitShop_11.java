package AdvancedConditionalStatesments.Lab;

import java.util.Scanner;

public class FruitShop_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double sum = 0.0;

        if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday")) {
            if (fruit.equals("banana")) {
                sum = quantity * 2.50;
            } else if (fruit.equals("apple")) {
                sum = quantity * 1.20;
            } else if (fruit.equals("orange")) {
                sum = quantity * 0.85;
            } else if (fruit.equals("grapefruit")) {
                sum = quantity * 1.45;
            } else if (fruit.equals("kiwi")) {
                sum = quantity * 2.70;
            } else if (fruit.equals("pineapple")) {
                sum = quantity * 5.50;
            } else if (fruit.equals("grapes")) {
                sum = quantity * 3.85;
            } else {
                System.out.println("error");
            }

        } else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
                if (fruit.equals("banana")) {
                    sum = quantity * 2.70;
                } else if (fruit.equals("apple")) {
                    sum = quantity * 1.25;
                } else if (fruit.equals("orange")) {
                    sum = quantity * 0.90;
                } else if (fruit.equals("grapefruit")) {
                    sum = quantity * 1.60;
                } else if (fruit.equals("kiwi")) {
                    sum = quantity * 3.00;
                } else if (fruit.equals("pineapple")) {
                    sum = quantity * 5.60;
                } else if (fruit.equals("grapes")) {
                    sum = quantity * 4.20;
                } else {
                    System.out.println("error");
                }
            } else {
            System.out.println("error");
        }

        if(sum != 0){
            System.out.printf("%.2f", sum);
        }
    }
}
