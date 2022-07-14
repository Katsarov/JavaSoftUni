package AdvancedConditionalStatesmets.Exercises;

import java.util.Scanner;

public class SummerOutfit_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int grad = Integer.parseInt(scanner.nextLine());
        String dayType = scanner.nextLine();

        String shoes = "";
        String outfit = "";

        if (dayType.equals("Morning")){
            if (grad >= 10 && grad <= 18){
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            } else if (grad > 18 && grad <= 24){
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (grad >= 25){
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
        } else if (dayType.equals("Afternoon")){
            if (grad >= 10 && grad <= 18){
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (grad > 18 && grad <= 24){
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else if (grad >= 25){
                outfit = "Swim Suit";
                shoes = "Barefoot";
            }
        } else if (dayType.equals("Evening")){
            outfit = "Shirt";
            shoes = "Moccasins";
        }

        System.out.printf("It's %d degrees, get your %s and %s.\n", grad, outfit, shoes);
    }
}
