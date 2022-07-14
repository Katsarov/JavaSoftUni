package WhileLoop.Exercise;

import java.util.Scanner;

public class Vacation_03_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double needMoney = Double.parseDouble(scanner.nextLine());
        double saveMoney = Double.parseDouble(scanner.nextLine());

        int countDays = 0;
        int spendDays = 0;

        while (saveMoney < needMoney) {
            if(spendDays == 5){
                break;
            }
            String action = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());
            countDays++;

            if (action.equals("save")) {
                saveMoney += amount;
                spendDays = 0;
            } else {
                spendDays++;
                saveMoney -= amount;
                if(saveMoney < 0){
                    saveMoney = 0;
                }
            }
        }

        if(spendDays == 5){
            System.out.println("You can't save the money.");
            System.out.println(countDays);
        } else {
            System.out.printf("You saved the money for %d days.", countDays);
        }
    }
}
