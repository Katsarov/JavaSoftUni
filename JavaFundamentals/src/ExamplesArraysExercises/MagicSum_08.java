package ExamplesArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int number = Integer.parseInt(scanner.nextLine());

        // Пример: имаме масива 1 7 6 2 9 13, а числото с което сравняваме е 8
        // На итерация 1 от външния цикъл имаме числото 1 (с индекс 0),
        // На итерация 1 от вътреяния цикъл имаме 1ислото 7 (с индекс 1, защото веще сме минали на следващия индекс -> 0 + 1 = 1)
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == number){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}
