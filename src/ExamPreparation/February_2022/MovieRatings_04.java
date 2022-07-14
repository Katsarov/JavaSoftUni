package ExamPreparation.February_2022;

import java.util.Scanner;

public class MovieRatings_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfFilms = Integer.parseInt(scanner.nextLine());

        double minScore = Double.MAX_VALUE;
        double maxScore = Double.MIN_VALUE;
        int counter = 0;

        double totalScore = 0;

        String movieHigestScore = "";
        String movieLowestScore = "";

        for (int i = 1; i <= numOfFilms; i++) {
            String movieName = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());

            if(rating > maxScore){
                maxScore = rating;
                movieHigestScore = movieName;
            }
            if(rating < minScore){
                minScore = rating;
                movieLowestScore = movieName;
            }
            totalScore += rating;
            counter++;
        }

        double averageScore = totalScore / counter;
        System.out.printf("%s is with highest rating: %.1f\n", movieHigestScore, maxScore);
        System.out.printf("%s is with lowest rating: %.1f\n", movieLowestScore, minScore);
        System.out.printf("Average rating: %.1f", averageScore);
    }
}
