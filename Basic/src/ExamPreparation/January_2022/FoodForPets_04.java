package ExamPreparation.January_2022;

import java.util.Scanner;

public class FoodForPets_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double foodGramms = Double.parseDouble(scanner.nextLine());

        int foodDog = 0;
        int foodCat = 0;
        int foodTotal = 0;
        double biscuits = 0;

        for (int i = 1; i <= days; i++) {
            int dogFoodReceived = Integer.parseInt(scanner.nextLine());
            int catFoodReceived = Integer.parseInt(scanner.nextLine());

            foodDog += dogFoodReceived;
            foodTotal+= dogFoodReceived;

            foodCat += catFoodReceived;
            foodTotal += catFoodReceived;

            if(i % 3 == 0){
                double bonusBiscuits = (dogFoodReceived + catFoodReceived) * 0.1;
                biscuits += bonusBiscuits;
            }
        }

        double foodEatenPercent = 1.0 * foodTotal / foodGramms * 100;
        double foodEatenFromDog = 1.0 * foodDog / foodTotal * 100;
        double foodEatenFromCat = 1.0 * foodCat / foodTotal * 100;

        System.out.printf("Total eaten biscuits: %.0fgr.\n", biscuits);
        System.out.printf("%.2f%% of the food has been eaten.\n", foodEatenPercent);
        System.out.printf("%.2f%% eaten from the dog.\n", foodEatenFromDog);
        System.out.printf("%.2f%% eaten from the cat.\n", foodEatenFromCat);
    }
}
