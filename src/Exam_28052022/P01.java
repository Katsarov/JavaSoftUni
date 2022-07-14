package Exam_28052022;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int rollsPaper = Integer.parseInt(scanner.nextLine());
        int rollsPlat = Integer.parseInt(scanner.nextLine());
        double litersGlue = Double.parseDouble(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());

        double pricePaper = 1.0 * rollsPaper * 5.8;
        double pricePlat = 1.0 * rollsPlat * 7.2;
        double priceGlue = litersGlue * 1.2;

        double sum = pricePaper + pricePlat + priceGlue;
        double percentDisc = 1.0 * percentDiscount / 100;
        double totalSum = sum - (sum * percentDisc);

        System.out.printf("%.3f", totalSum);

    }
}
