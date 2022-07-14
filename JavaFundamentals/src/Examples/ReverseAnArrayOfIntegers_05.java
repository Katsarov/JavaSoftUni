package Examples;

import java.util.Scanner;

public class ReverseAnArrayOfIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четем число от конзолата
        int num = Integer.parseInt(scanner.nextLine());

        // Правим си един числов масив, в който ще съхраняваме прочетените числа
        int[] arr = new int[num];

        // Правим цикъл, с който четем всяко въведено число и го записваме в матрицата arr с пореден индекс
        for (int i = 0; i < num; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            arr[i] = number;
        }

        // Правим нов цикъл, с който обръщаме индексите на числата
        for (int i = 0; i < arr.length / 2; i++) {
            int otherIndex = arr.length - 1 - i;

            int currentNumber = arr[i];
            arr[i] = arr[otherIndex];
            arr[otherIndex] = currentNumber;
        }

        // Отпечатваме новия масив
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
