package WhileLoop.Lab;

import java.util.Scanner;

public class MaxNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int maxNumber = Integer.MIN_VALUE;

        while (!input.equals("Stop")){
            int num = Integer.parseInt(input);
            if (num > maxNumber){
                maxNumber = num;
            }

            input = scanner.nextLine();
        }
        System.out.println(maxNumber);
    }
}
