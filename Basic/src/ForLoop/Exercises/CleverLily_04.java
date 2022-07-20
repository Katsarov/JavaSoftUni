package ForLoop.Exercises;

import java.util.Scanner;

public class CleverLily_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double laundryPrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int moneyReceived = 0;
        int sumEvenBirthdays = 0;
        int sumToys = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0){
                sumEvenBirthdays++;
                for (int j = 0; j < sumEvenBirthdays; j++) {
                    moneyReceived += 10;
                }
            } else {
                sumToys++;
            }
        }

        int totalAmountToys = toyPrice * sumToys;

        double totalMoneySaved = ((totalAmountToys + moneyReceived) * 1.0) - sumEvenBirthdays;

        if (totalMoneySaved >= laundryPrice){
            System.out.printf("Yes! %.2f", totalMoneySaved - laundryPrice);
        } else {
            System.out.printf("No! %.2f", laundryPrice - totalMoneySaved);
        }
    }
}
