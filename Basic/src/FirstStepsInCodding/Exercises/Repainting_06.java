package FirstStepsInCodding.Exercises;

import java.util.Scanner;

public class Repainting_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int nilon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double nilonPrice = 1.50;
        double paintPrice = 14.50;
        double thinnerPrice = 5.00;
        double bagsPrice = 0.40;

        // Calculations
        double totalNilon = (nilon + 2) * nilonPrice;
        double totalPaint = (paint * 1.1) * paintPrice;
        double totalThinner = thinner * thinnerPrice;

        double amount = totalNilon + totalPaint + totalThinner + bagsPrice;
        double paidPerHourWork = (amount * 0.3) * hours;

        double totalAmount = amount + paidPerHourWork;

        System.out.println(totalAmount);
    }
}
