package FirstStepsInCodding.Exercises;

import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        //•	Пилешко меню –  10.35 лв.
        //•	Меню с риба – 12.40 лв.
        //•	Вегетарианско меню  – 8.15 лв.

        int chickenMenus = Integer.parseInt(scanner.nextLine());
        int fishMenus = Integer.parseInt(scanner.nextLine());
        int veganMenus = Integer.parseInt(scanner.nextLine());

        double priceChickenMenu = 10.35;
        double priceFishMenu = 12.40;
        double priceVeganMenu = 8.15;
        double priceDelivery = 2.50;

        // Calculations

        double totalChikenAmount = chickenMenus * priceChickenMenu;
        double totalFishAmount = fishMenus * priceFishMenu;
        double totalVeganAmount = veganMenus * priceVeganMenu;

        double totalAmount = totalChikenAmount + totalVeganAmount + totalFishAmount;

        double desertPrice = totalAmount * 0.2;

        double amount = totalAmount + desertPrice + priceDelivery;

        System.out.println(amount);
    }
}
