package Exam_28052022;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double priceTschirt = Double.parseDouble(scanner.nextLine());
        double sumToWinBall = Double.parseDouble(scanner.nextLine());

        double priceGasteta = priceTschirt * 0.75;
        double priceSockets = priceGasteta * 0.2;
        double priceShoes = (priceTschirt + priceGasteta) * 2;

        double sum = priceTschirt + priceGasteta + priceSockets + priceShoes;

        double sumAfterDiscount = sum - (sum * 0.15);

        if(sumAfterDiscount >= sumToWinBall){
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.\n", sumAfterDiscount);
        } else {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.", sumToWinBall - sumAfterDiscount);
        }
    }
}
