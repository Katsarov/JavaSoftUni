package ExamPreparation;

import java.util.Scanner;

public class Repair_WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        // Calculate all area
        int allArea = height * width * 4;
        allArea = allArea - allArea * percent / 100;

        String input = scanner.nextLine();

        //Start painting
        while (!input.equals("Tired!")){
            double paint = Double.parseDouble(input);
            allArea -= paint;

            //If we painted all, we finished
            if(allArea <= 0){
                break;
            }

            input = scanner.nextLine();
        }

        if (allArea == 0){
            System.out.printf("All walls are painted! Great job, Pesho!");
        } else if(allArea < 0){
            System.out.printf("All walls are painted and you have %d l paint left!", Math.abs(allArea));
        } else {
            System.out.printf("%d quadratic m left.", allArea);
        }
    }
}
