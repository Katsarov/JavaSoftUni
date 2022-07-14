package FirstStepsInCodding.Exercises;

import java.util.Scanner;

public class SuppliesForSchool_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        // input
        int pensilsPacks = Integer.parseInt(scanner.nextLine());
        int markersPacks = Integer.parseInt(scanner.nextLine());
        int litersClean = Integer.parseInt(scanner.nextLine());
        int percentageDiscount = Integer.parseInt(scanner.nextLine());

        // prices
        double pricePackPensils = 5.80;
        double pricePackMarkers = 7.20;
        double priceClean = 1.20;

        // calculations
        double amount = (pensilsPacks * pricePackPensils) + (markersPacks * pricePackMarkers) + (litersClean * priceClean);

        double discount = percentageDiscount * 0.01;

        double totalAmount = amount - (amount * discount);

        // print output
        System.out.println(totalAmount);
    }
}
