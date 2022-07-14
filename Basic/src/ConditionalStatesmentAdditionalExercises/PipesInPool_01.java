package ConditionalStatesmentAdditionalExercises;

import java.util.Scanner;

public class PipesInPool_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int volume = Integer.parseInt(scanner.nextLine());
        int firstPipe = Integer.parseInt(scanner.nextLine());
        int secondPipe = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double firstPipeFilled = firstPipe * hours;
        double secondPipeFilled = secondPipe * hours;

        double bothPipesFilled = firstPipeFilled + secondPipeFilled;

        if (volume >= bothPipesFilled){
            double totalPercentage = bothPipesFilled / volume * 100;
            double firstPipePercentage = firstPipeFilled / bothPipesFilled * 100;
            double secondPipePercentage = secondPipeFilled / bothPipesFilled * 100;

            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", totalPercentage, firstPipePercentage, secondPipePercentage);
        } else {
            double overflow = bothPipesFilled - volume;
            System.out.printf("For %.1f hours the pool overflows with %.2f liters.", hours, overflow);
        }
    }
}
