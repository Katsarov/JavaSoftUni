package AdvancedConditionalStatesments.Lab;

import java.util.Scanner;

public class CinemaTicket_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int price1 = 12;
        int price2 = 14;
        int price3 = 16;

        if ("Monday".equals(day) || "Tuesday".equals(day) || "Friday".equals(day)) {
            System.out.println(price1);
        } else if ("Wednesday".equals(day) || "Thursday".equals(day)) {
            System.out.println(price2);
        } else if ("Saturday".equals(day) || "Sunday".equals(day)) {
            System.out.println(price3);
        }
    }
}
