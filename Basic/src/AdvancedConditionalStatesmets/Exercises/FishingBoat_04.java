package AdvancedConditionalStatesmets.Exercises;

import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishersNumber = Integer.parseInt(scanner.nextLine());

        double totalSum = 0.0;

        if (season.equals("Spring")){
            double sum = 0.0;
            if (fishersNumber <= 6){
                sum = 3000 * 0.9;
            } else if (fishersNumber >= 7 && fishersNumber <= 11){
                sum = 3000 * 0.85;
            } else if (fishersNumber >= 12){
                sum = 3000 * 0.75;
            }
            if (fishersNumber % 2 == 0){
                sum *= 0.95;
            }
            totalSum = sum;

        } else  if (season.equals("Summer") || season.equals("Autumn")){
            double sum = 0.0;
            if (fishersNumber <= 6){
                sum = 4200 * 0.9;
            } else if (fishersNumber >= 7 && fishersNumber <= 11){
                sum = 4200 * 0.85;
            } else if (fishersNumber >= 12){
                sum = 4200 * 0.75;
            }
            if (season.equals("Summer") && fishersNumber % 2 == 0){
                sum *= 0.95;
            }
            totalSum = sum;
        } else  if (season.equals("Winter")){
            double sum = 0.0;
            if (fishersNumber <= 6){
                sum = 2600 * 0.9;
            } else if (fishersNumber >= 7 && fishersNumber <= 11){
                sum = 2600 * 0.85;
            } else if (fishersNumber >= 12){
                sum = 2600 * 0.75;
            }
            if (fishersNumber % 2 == 0){
                sum *= 0.95;
            }
            totalSum = sum;
        }

        double leftMoney = totalSum - budget;

        if (totalSum > budget){
            System.out.printf("Not enough money! You need %.2f leva.", leftMoney);
        } else {
            System.out.printf("Yes! You have %.2f leva left.", Math.abs(leftMoney));
        }
    }
}
