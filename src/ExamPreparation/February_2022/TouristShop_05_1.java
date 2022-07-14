package ExamPreparation.February_2022;

import java.util.Scanner;

public class TouristShop_05_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());

        String product = scanner.nextLine();

        int counter = 0;
        double totalSum = 0;
        boolean flag = false;
        double neededMoney = 0;

        while (!product.equals("Stop")){
            double price = Double.parseDouble(scanner.nextLine());

            counter++;

            if (counter % 3 == 0) {
                price = price / 2;
            }
            if(price > budget){
                flag = true;
                neededMoney = price - budget;
                break;
            }

            budget -= price;
            totalSum += price;

            product = scanner.nextLine();
        }

        if(!flag) {
            System.out.printf("You bought %d products for %.2f leva.", counter, totalSum);
        }
        else {
            System.out.println("You don't have enough money!");
            System.out.printf("You need %.2f leva!", neededMoney);
        }
    }
}
