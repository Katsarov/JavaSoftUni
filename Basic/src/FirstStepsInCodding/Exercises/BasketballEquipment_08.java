package FirstStepsInCodding.Exercises;

import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        //•	Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        //•	Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        //•	Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        //•	Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка

        int yearTax = Integer.parseInt(scanner.nextLine());

        // Calculations
        double shoesPrice = yearTax * 0.6;    //double shoesPrice = yearTax - (yearTax * 40 / 100.00);
        double sportsWearPrice = shoesPrice * 0.8;
        double ballPrice = sportsWearPrice * 0.25;
        double accessoriesPrice = ballPrice * 0.2;

        double totalAmount = yearTax + shoesPrice + sportsWearPrice + ballPrice + accessoriesPrice;

        System.out.println(totalAmount);
    }
}
