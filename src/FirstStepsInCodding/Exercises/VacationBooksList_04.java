package FirstStepsInCodding.Exercises;

import java.util.Scanner;

public class VacationBooksList_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // input
        int bookPages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        // calculation
        int hoursPerDay = bookPages / pagesPerHour;
        int daysNeeded = hoursPerDay / days;

        // print output
        System.out.println(daysNeeded);
    }
}
