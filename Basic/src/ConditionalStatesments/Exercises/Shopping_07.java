package ConditionalStatesments.Exercises;

import java.util.Scanner;

public class Shopping_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numVideocards = Integer.parseInt(scanner.nextLine());
        int numProcessors = Integer.parseInt(scanner.nextLine());
        int numRam = Integer.parseInt(scanner.nextLine());

        double priceVideocards = numVideocards * 250.00;
        double priceProcessors = numProcessors * (priceVideocards * 0.35);
        double priceRam = numRam * (priceVideocards * 0.1);

        double totalPrice = priceVideocards + priceProcessors + priceRam;

        if(numVideocards > numProcessors){
            totalPrice *= 0.85;
        }

        if(totalPrice <= budget){
            System.out.printf("You have %.2f leva left!", budget - totalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", totalPrice - budget);
        }
    }
}
