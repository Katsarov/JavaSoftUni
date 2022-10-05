package ExamplesMethodsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class Examples_00 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] dna = new String[n];

        String line = scanner.nextLine();

        while (!line.equals("Clone them!")){
            // 1!0!1!1!0
            String data = line.replaceAll("!", "");
            // [1,11]
            dna = data.split("0");

            for (int i = 0; i < dna.length; i++) {

            }

            line = scanner.nextLine();
        }
    }
}
