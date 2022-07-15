package ConditionalStatesments.Exercises;

import java.util.Scanner;

public class GodzillaVsKong_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double filmBudget = Double.parseDouble(scanner.nextLine());
        int acteoursNumber = Integer.parseInt(scanner.nextLine());
        double clothesMoney = Double.parseDouble(scanner.nextLine());

        double decorBudget = filmBudget * 0.1;
        double totalClothesBudget = acteoursNumber * clothesMoney;

        if (acteoursNumber > 150){
            totalClothesBudget *= 0.9;
        }

        double totalBudget = totalClothesBudget + decorBudget;

        if(totalBudget <= filmBudget){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", filmBudget - totalBudget);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", totalBudget - filmBudget);
        }
    }
}
