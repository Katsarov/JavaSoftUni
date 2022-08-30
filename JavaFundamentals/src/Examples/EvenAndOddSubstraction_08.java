package Examples;

import java.util.Scanner;

public class EvenAndOddSubstraction_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: 2 4 6 8 10
        // Solution: 2+4+6+8+10 = 30 (30 - 0 = 30)
        // Output: 30

        String input = scanner.nextLine();
        String [] numbersAsStrings = input.split("\\s+");

        int evenSum = 0;
        int oddSum = 0;

        // Сега трябва да получим числа от този стринг масив. За целта трябва да минем по всичките му елементи и всеки елемент да го парснем към integer.
        // Тъй като не ни трябват индекситре на елементите, ще използваме foreach loop.

        for (String s : numbersAsStrings) {
            // Да си извадим сега числото
            int number = Integer.parseInt(s);

            if (number % 2 == 0){
                evenSum += number;
            } else {
                oddSum += number;
            }
        }

        int result = evenSum - oddSum;
        System.out.println(result);

    }
}
