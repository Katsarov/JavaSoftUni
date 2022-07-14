package ForLoop.Exercises;

import java.util.Scanner;

public class Histogram_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int digit = Integer.parseInt(scanner.nextLine());

            if (digit < 200){
                p1 += 1;
            } else if(digit >=200 && digit <= 399){
                p2 += 1;
            } else if(digit >= 400 && digit <= 599){
                p3 += 1;
            } else if(digit >= 600 && digit <=799){
                p4 += 1;
            } else if(digit >= 800){
                p5 += 1;
            }
            sum++;
        }

        double percentP1 = (1.0 * p1 / sum) * 100;
        double percentP2 = (1.0 * p2 / sum) * 100;
        double percentP3 = (1.0 * p3 / sum) * 100;
        double percentP4 = (1.0 * p4 / sum) * 100;
        double percentP5 = (1.0 * p5 / sum) * 100;

        System.out.printf("%.2f%%\n", percentP1);
        System.out.printf("%.2f%%\n", percentP2);
        System.out.printf("%.2f%%\n", percentP3);
        System.out.printf("%.2f%%\n", percentP4);
        System.out.printf("%.2f%%\n", percentP5);
    }
}
