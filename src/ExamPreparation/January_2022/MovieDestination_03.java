package ExamPreparation.January_2022;

import java.util.Scanner;

public class MovieDestination_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double sum = 0;

        switch (season) {
            case "Winter":
                if (destination.equals("Dubai")) {
                    sum = 1.0 * days * (45000 * 0.7);
                } else if (destination.equals("Sofia")) {
                    sum = 1.0 * days * (17000 * 1.25);
                } else if (destination.equals("London")) {
                    sum = 1.0 * days * 24000;
                }
                break;
            case "Summer":
                if (destination.equals("Dubai")) {
                    sum = 1.0 * days * (40000 * 0.7);
                } else if (destination.equals("Sofia")) {
                    sum = 1.0 * days * (12500 * 1.25);
                } else if (destination.equals("London")) {
                    sum = 1.0 * days * 20250;
                }
                break;
        }

        if(budget >= sum){
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", budget - sum);
        } else {
            System.out.printf("The director needs %.2f leva more!", sum - budget);
        }
    }
}
