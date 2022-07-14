package ConditionalStatesments.Exercises;

import java.util.Scanner;

public class ToyShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceTrip = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int toy = Integer.parseInt(scanner.nextLine());
        int bear = Integer.parseInt(scanner.nextLine());
        int minion = Integer.parseInt(scanner.nextLine());
        int truck = Integer.parseInt(scanner.nextLine());

        double totalMoney = (puzzle * 2.6) + (toy * 3.0) + (bear * 4.1) + (minion * 8.2) + (truck * 2.0);

        int soldToys = puzzle + toy + bear + minion + truck;

        if(soldToys >= 50){
            totalMoney *= 0.75;
        }

        double leftMoney = totalMoney * 0.9;

        if(leftMoney >= priceTrip){
            System.out.printf("Yes! %.2f lv left.", leftMoney - priceTrip);
        } else  {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(leftMoney - priceTrip));
        }
    }
}
