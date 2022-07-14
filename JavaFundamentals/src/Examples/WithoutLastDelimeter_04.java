package Examples;

import java.util.Scanner;

public class WithoutLastDelimeter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersCount = scanner.nextInt();

        int[] numbers = new int[numbersCount];

//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + ",");
//        }

        // Ако въведем числото 3, ще се принтира: 0,0,0,
        // Как да не отпечатваме последната запетая?

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);

            if (i != numbers.length - 1){
                System.out.print(",");
            }
        }

        // Ако въведем числото 3, ще се отпечата: 0,0,0 (без , след последната нула)
    }
}
