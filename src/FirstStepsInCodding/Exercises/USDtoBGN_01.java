package FirstStepsInCodding.Exercises;

import java.util.Scanner;

public class USDtoBGN_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double leva = Double.parseDouble(scanner.nextLine());

        double usd = 1.79549;

        double amount = leva * usd;

        System.out.println(amount);
        //System.out.printf("%.2f\n", amount);
    }
}
