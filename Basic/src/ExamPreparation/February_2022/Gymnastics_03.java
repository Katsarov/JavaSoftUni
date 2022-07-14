package ExamPreparation.February_2022;

import java.util.Scanner;

public class Gymnastics_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String device = scanner.nextLine();

        double totalGrade = 0;

        if (country.equals("Russia")) {
            if (device.equals("ribbon")) {
                totalGrade = 9.10 + 9.40;
            } else if (device.equals("hoop")) {
                totalGrade = 9.30 + 9.80;
            } else if (device.equals("rope")) {
                totalGrade = 9.60 + 9.0;
            }
        } else if (country.equals("Bulgaria")) {
            if (device.equals("ribbon")) {
                totalGrade = 9.60 + 9.40;
            } else if (device.equals("hoop")) {
                totalGrade = 9.55 + 9.75;
            } else if (device.equals("rope")) {
                totalGrade = 9.50 + 9.40;
            }
        } else if (country.equals("Italy")) {
            if (device.equals("ribbon")) {
                totalGrade = 9.20 + 9.50;
            } else if (device.equals("hoop")) {
                totalGrade = 9.45 + 9.35;
            } else if (device.equals("rope")) {
                totalGrade = 9.70 + 9.15;
            }
        }

        double percentage = (1.0 * 20 - totalGrade) / 20 * 100;
        System.out.printf("The team of %s get %.3f on %s.\n", country, totalGrade, device);
        System.out.printf("%.2f%%", percentage);
    }
}
