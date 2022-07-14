package WhileLoop.Exercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripMoney = Double.parseDouble(scanner.nextLine());
        double haveMoney = Double.parseDouble(scanner.nextLine());

        int spendMoneySum = 0;
        int savedMoneySum = 0;
        int dayCounter = 0;

        boolean isEnoughMoney = false;

        while (haveMoney < tripMoney){

            String action = scanner.nextLine();
            int money = Integer.parseInt(scanner.nextLine());

            switch (action){
                case "spend":
                    spendMoneySum += money;
                    break;
                case "save":
                    savedMoneySum += money;
                    break;
            }
            dayCounter++;
            if(dayCounter == 5){
                System.out.println("You can't save the money.");
                System.out.println(dayCounter);
                break;
            }

            if(haveMoney + savedMoneySum >= tripMoney){
                isEnoughMoney = true;
                break;
            }
        }

        if(isEnoughMoney){
            System.out.printf("You saved the money for %d days.", dayCounter);
        }
    }
}
