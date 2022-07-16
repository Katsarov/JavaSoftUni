package AdvancedConditionalStatesments.Lab;

import java.util.Scanner;

public class WeekendOrWorkingDay_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayOfWeek = scanner.nextLine();

        switch (dayOfWeek){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Working day");
                break;
            case "Saturday":
                System.out.println("Weekend");
                break;
            case "Sunday":
            default:
                System.out.println("Error");
                break;
        }
    }
}
