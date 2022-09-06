package ExamplesArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        int [] array = new int[wagons];

        // 1. Обхождаме масива и го пълним с данни
        for (int i = 0; i < array.length; i++) {
            int pasagers = Integer.parseInt(scanner.nextLine());
            sum += pasagers;
            array[i] = pasagers;
        }

        // 2. Принтираме данните от масива
        // Вариант 1: с фор цикъл
//        for (int wagon : array) {
//            System.out.print(wagon + " ");
//        }

        // Вариант 2: Със стрийм
        Arrays.stream(array).forEach(wagon -> System.out.print(wagon + " "));

        System.out.println();
        System.out.println(sum);
    }
}
