package ExamPreparation.January_2022;

import java.util.Scanner;

public class FamilyTrip_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        int addCost = Integer.parseInt(scanner.nextLine());

        double sumNights = nights * pricePerNight;

        double sumAddCosts = budget * addCost / 100;

        if(nights > 7){
            sumNights = nights * (pricePerNight * 0.95);
        }

        double totalSum = sumNights + sumAddCosts;

        if(totalSum <= budget){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - totalSum);
        } else {
            System.out.printf("%.2f leva needed.", totalSum - budget);
        }
    }
}
