package FirstStepsInCodding.Lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // read input
        int dogsFood = Integer.parseInt(scanner.nextLine());
        int catsFood = Integer.parseInt(scanner.nextLine());

        // set prices
        double priceDogsFood = 2.5;
        double priceCatsFood = 4.0;

        //calculations
        double sumDogs = dogsFood * priceDogsFood;
        double sumCats = catsFood * priceCatsFood;

        double totalSum = sumCats + sumDogs;

        //print output
        System.out.println(totalSum + " lv.");
    }
}
