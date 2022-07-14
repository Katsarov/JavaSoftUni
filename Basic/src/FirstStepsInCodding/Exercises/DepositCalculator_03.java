package FirstStepsInCodding.Exercises;

import java.util.Scanner;

public class DepositCalculator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // read input
        double depositAmount = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double monthlyRateTax = Double.parseDouble(scanner.nextLine());

        // calculations
        double accTaxRate = depositAmount * (monthlyRateTax / 100);
        double taxRateMonth = accTaxRate / 12;
        double calculation = depositAmount + months * (taxRateMonth);

        System.out.println(calculation);
    }
}
