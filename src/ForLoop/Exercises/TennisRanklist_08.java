package ForLoop.Exercises;

import java.util.Scanner;

public class TennisRanklist_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfTournaments = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());

        int finalPointsW = 0;
        int finalPointsF = 0;
        int finalPointsSF = 0;
        int sumOfTournaments = 0;
        int sumOfTournamentsW = 0;

        for (int i = 0; i < numOfTournaments; i++) {
            String tournamentStage = scanner.nextLine();

            if(tournamentStage.equals("W")){
                finalPointsW += 2000;
                sumOfTournaments++;
                sumOfTournamentsW++;
            } else if(tournamentStage.equals("F")){
                finalPointsF += 1200;
                sumOfTournaments++;
            } else if(tournamentStage.equals("SF")){
                finalPointsSF += 720;
                sumOfTournaments++;
            }
        }

        int finalPoints = finalPointsW + finalPointsF + finalPointsSF + startPoints;

        double averagePoints = Math.floor((finalPoints - startPoints) / sumOfTournaments);
        double percentWinningTournaments = (1.0 * sumOfTournamentsW / sumOfTournaments) * 100;

        System.out.printf("Final points: %d\n", finalPoints);
        System.out.printf("Average points: %.0f\n", averagePoints);
        System.out.printf("%.2f%%\n", percentWinningTournaments);
    }
}
