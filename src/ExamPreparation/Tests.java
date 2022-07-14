package ExamPreparation;

import java.util.Scanner;

public class Tests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // =========================== representation of hours and minutes =================
//        int minutes = 137;
//        int hours = minutes / 60;
//        int remainingMinutes = minutes % 60;
//
//        System.out.printf("%d minutes are equal to ", minutes);
//        System.out.printf("%d hours and %d minutes\n", hours, remainingMinutes);

        // =======================  boolean =================================================
//        int s = 5;
//        boolean isInRange = s > 10 && (s <= 15 || s <= 5);
//
//        System.out.println(isInRange);

        // ====================== ternar operator =======================================
//        int a = 5;
//        int b = 7;
//
//        boolean isGreater = a > b;
//
//        System.out.println(isGreater ? "a > b" : "b > a");    // exit: b > a

        // Find the biggest number from 3

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int greatest = Math.max(a, Math.max(b,c));

        System.out.println(greatest);

    }
}

