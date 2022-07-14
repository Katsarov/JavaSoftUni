package WhileLoop.Exercise;

import java.util.Scanner;

public class Walking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int target = 10000;

        String input = scanner.nextLine();
        int stepsSum = 0;

        while (stepsSum < target) {
            if (input.equals("Going home")) {
                int addSteps = Integer.parseInt(scanner.nextLine());
                stepsSum += addSteps;
                if (stepsSum >= target) {
                    System.out.println("Goal reached! Good job!");
                    System.out.printf("%d steps over the goal!", stepsSum - target);
                } else {
                    System.out.printf("%d more steps to reach goal.", Math.abs(target - stepsSum));
                }
                break;
            }
            int steps = Integer.parseInt(input);
            stepsSum += steps;

            if (stepsSum >= target) {
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!", stepsSum - target);
                break;
            }
            input = scanner.nextLine();
        }
    }
}
