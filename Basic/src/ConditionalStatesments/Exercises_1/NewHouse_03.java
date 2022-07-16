package AdvancedConditionalStatesmets.Exercises;

import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowersType = scanner.nextLine();
        int flowersQuantity = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double sum = 0.0;

        switch (flowersType){
            case "Roses":
                if (flowersQuantity > 80){
                    sum = (flowersQuantity * 5) * 0.9;
                } else {
                    sum = flowersQuantity * 5;
                }
                break;
            case "Dahlias":
                if (flowersQuantity > 90){
                    sum = (flowersQuantity * 3.80) * 0.85;
                } else {
                    sum = flowersQuantity * 3.80;
                }
                break;
            case "Tulips":
                if (flowersQuantity > 80){
                    sum = (flowersQuantity * 2.80) * 0.85;
                } else {
                    sum = flowersQuantity * 2.80;
                }
                break;
            case "Narcissus":
                if (flowersQuantity < 120){
                    sum = (flowersQuantity * 3) * 1.15;
                } else {
                    sum = flowersQuantity * 3;
                }
                break;
            case "Gladiolus":
                if (flowersQuantity < 80){
                    sum = (flowersQuantity * 2.5) * 1.2;
                } else {
                    sum = flowersQuantity * 2.5;
                }
                break;
        }

        if (budget >= sum){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowersQuantity, flowersType, budget - sum);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", sum - budget);
        }
    }
}
