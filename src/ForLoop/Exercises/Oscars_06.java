package ForLoop.Exercises;

import java.util.Scanner;

public class Oscars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double pointsActor = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        double sumPoints = pointsActor;

        for (int i = 0; i < n; i++) {
            String juriName = scanner.nextLine();
            double juriPoints = Double.parseDouble(scanner.nextLine());

            int juriNamePoints = juriName.length();
            double totalJuriPoints = (juriNamePoints * juriPoints) / 2;
            sumPoints += totalJuriPoints;

            if (sumPoints >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, sumPoints);
                return;
            }
        }

        System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - sumPoints);

    }
}
