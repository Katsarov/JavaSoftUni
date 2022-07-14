package Exam_28052022;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        int count = 0;
        double sells = 0.0;
        int ratingScore = 0;

        for (int i = 0; i < n; i++) {
            int rating = Integer.parseInt(scanner.nextLine());
            count++;

            if(rating % 10 == 2){
                int possibleSells = rating / 10;
                sells += possibleSells * 0;
                ratingScore += 2;
            } else if(rating % 10 == 3){
                int possibleSells = rating / 10;
                sells += possibleSells * 0.5;
                ratingScore += 3;
            } else if(rating % 10 == 4){
                int possibleSells = rating / 10;
                sells += possibleSells * 0.7;
                ratingScore += 4;
            } else if(rating % 10 == 5){
                int possibleSells = rating / 10;
                sells += possibleSells * 0.85;
                ratingScore += 5;
            } else if(rating % 10 == 6){
                int possibleSells = rating / 10;
                sells += possibleSells * 1;
                ratingScore += 6;
            }
        }

        System.out.printf("%.2f\n", sells);
        System.out.printf("%.2f", 1.0 * ratingScore / count);
    }
}
