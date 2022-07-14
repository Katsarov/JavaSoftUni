package AdvancedConditionalStatesmets.Exercises;

import java.util.Scanner;

public class OnTimeForTheExam_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());

        int totalMinutesExam = examHour * 60 + examMinutes;
        int totalMinutesStudent = arrivalHour * 60 + arrivalMinutes;

        if (totalMinutesExam == totalMinutesStudent){
            System.out.println("On time");
        } else if (totalMinutesStudent > totalMinutesExam){
            int minutesLate = totalMinutesStudent - totalMinutesExam;
            if (minutesLate < 60){
                System.out.println("Late");
                System.out.printf("%d minutes after the start", minutesLate);
            } else {
                int hours = minutesLate / 60;
                int minutes = minutesLate % 60;
                System.out.println("Late");
                System.out.printf("%d:%02d hours after the start", hours, minutes);
            }
        } else if(totalMinutesExam > totalMinutesStudent){
            int minutesEarlier = totalMinutesExam - totalMinutesStudent;
            if (minutesEarlier <= 30){
                System.out.println("On time");
                System.out.printf("%d minutes before the start", minutesEarlier);
            } else if (minutesEarlier <= 59){
                System.out.println("Early");
                System.out.printf("%d minutes before the start", minutesEarlier);
            } else {
                int hours = minutesEarlier / 60;
                int minutes = minutesEarlier % 60;
                System.out.println("Early");
                System.out.printf("%d:%02d hours before the start", hours, minutes);
            }
        }
    }
}
