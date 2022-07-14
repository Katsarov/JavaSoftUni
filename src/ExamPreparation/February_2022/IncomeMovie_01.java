package ExamPreparation.February_2022;

import java.util.Scanner;

public class IncomeMovie_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());
        int percentage = Integer.parseInt(scanner.nextLine());

        double income = tickets * ticketPrice;
        double incomeTotal = income * days;

        double finalIncom = incomeTotal - (incomeTotal * percentage / 100);


        System.out.printf("The profit from the movie %s is %.2f lv.", name,finalIncom);
    }
}
