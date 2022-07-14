package FirstStepsInCodding.Exercises;

import java.util.Scanner;

public class FishTank_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());

        int calcVolume = length * width * height;
        double calcLitters = calcVolume * 0.001;
        double calcPercentage = percentage * 0.01;

        double volume = calcLitters - (calcLitters * calcPercentage);

        System.out.println(volume);
    }
}
