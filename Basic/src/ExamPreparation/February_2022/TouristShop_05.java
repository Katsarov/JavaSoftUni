package ExamPreparation.February_2022;

import java.util.Scanner;

public class TouristShop_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());

        double totalSum = 0;
        int counter = 0;
        boolean isFinished = false;

        while (budget >= 0) {
            String name = scanner.nextLine();
            if (name.equals("Stop")) {
                isFinished = true;
                break;
            }
            double productPrice = Double.parseDouble(scanner.nextLine());

            counter++;

            if (counter % 3 == 0) {
                productPrice = productPrice / 2.0;
                budget -= productPrice;
            }
            if(budget < 0){
                totalSum -= budget;
            }

            totalSum += productPrice;
            budget -= productPrice;
        }

        if(isFinished){
            System.out.printf("You bought %d products for %.2f leva.", counter, totalSum);
        }
        else if(budget < 0){
            System.out.println("You don't have enough money!");
            System.out.printf("You need %.2f leva!", Math.abs(budget));
        }
    }
}
