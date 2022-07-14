package ExamPreparation.February_2022;

import java.util.Scanner;

public class VetParking_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double totalSum = 0;

        for (int i = 1; i <= days; i++) {
            if(i % 2 != 0){
                double daySum = 0;
                for (int j = 1; j <= hours; j++) {

                    if(j % 2 != 0){
                        daySum += 1.0;
                    } else {
                        daySum += 1.25;
                    }
                }
                totalSum += daySum;
                System.out.printf("Day: %d - %.2f leva\n", i, daySum);
            } else {
                double daySum = 0;
                for (int j = 1; j <= hours; j++) {

                    if(j % 2 != 0){
                        daySum += 2.5;
                    } else {
                        daySum += 1.0;
                    }
                }
                totalSum += daySum;
                System.out.printf("Day: %d - %.2f leva\n", i, daySum);
            }
        }
        System.out.printf("Total: %.2f leva\n", totalSum);
    }
}
