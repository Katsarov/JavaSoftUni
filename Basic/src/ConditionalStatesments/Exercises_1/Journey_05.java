package AdvancedConditionalStatesmets.Exercises;

import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double moneyForHoliday = 0.0;
        String type = "";
        String destination = "";

        if (budget <= 100){
            if (season.equals("summer")){
                moneyForHoliday = budget * 0.3;
                type = "Camp";
            } else if (season.equals("winter")){
                moneyForHoliday = budget * 0.7;
                type = "Hotel";
            }
            destination = "Bulgaria";
        } else if (budget > 100 && budget <= 1000){
            if (season.equals("summer")){
                moneyForHoliday = budget * 0.4;
                type = "Camp";
            } else if (season.equals("winter")){
                moneyForHoliday = budget * 0.8;
                type = "Hotel";
            }
            destination = "Balkans";
        } else  if (budget > 1000){
                moneyForHoliday = budget * 0.9;
                type = "Hotel";
                destination = "Europe";
        }

        System.out.printf("Somewhere in %s\n", destination);
        System.out.printf("%s - %.2f", type, moneyForHoliday);
    }
}
