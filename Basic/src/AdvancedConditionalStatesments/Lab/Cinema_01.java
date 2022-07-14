package AdvancedConditionalStatesments.Lab;

import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieType = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double premiere = 12.00;
        double normal = 7.50;
        double discount = 5.00;

        int income = rows * columns;
        double totalIncome = 0.0;

        switch (movieType){
            case "Premiere":
                totalIncome = income * premiere;
                break;
            case  "Normal":
                totalIncome = income * normal;
                break;
            case "Discount":
                totalIncome = income * discount;
                break;
        }

        System.out.printf("%.2f\nleva", totalIncome);
    }
}
