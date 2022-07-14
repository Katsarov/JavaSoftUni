package ExamPreparation.February_2022;

import java.util.Scanner;

public class FamilyTrip_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int accommodations = Integer.parseInt(scanner.nextLine());
        double priceAccommodation = Double.parseDouble(scanner.nextLine());
        int percentAddCost = Integer.parseInt(scanner.nextLine());

        double sumAccommodations = 0;
        double finalAddCosts = 0;
        double totalSum = 0;

        if (accommodations <= 7) {
            sumAccommodations = 1.0 * accommodations * priceAccommodation;
            finalAddCosts = 1.0 * budget * percentAddCost / 100;
            totalSum = sumAccommodations + finalAddCosts;

        } else {
            sumAccommodations = 1.0 * accommodations * (priceAccommodation* 0.95);
            finalAddCosts = 1.0 * budget * percentAddCost / 100;
            totalSum = sumAccommodations + finalAddCosts;
        }

        if(totalSum <= budget){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - totalSum);
        } else {
            System.out.printf("%.2f leva needed.", totalSum - budget);
        }
    }
}
