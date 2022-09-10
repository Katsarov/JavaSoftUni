package ExamplesArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class OnlyExamples_00 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Искаме да запазим следните имена: Kaloyan Peter Sofia Plamen в един масив
        // ================== Вариант 1: като ги "хардкорднем" ============================================
//        String [] names = {"Kaloyan", "Peter", "Sofia", "Plamen"};
//        String name = names[2];
//        System.out.println(name);

        // ================= Вариант 2: да ги прочетем от конзолата =======================================
        // Задължително е да кажем колко елемента ще има този масив -> в случая 4
//        String[] namesFromConsole = new String[4];
//
//        // За да налеем имената в масива, трябва да го прочетем
//        for (int i = 0; i < namesFromConsole.length; i++) {
//            namesFromConsole[i] = scanner.nextLine();
//        }

        // ================   Как да прочетем и налеем имената, ако са на един ред?   =====================
        // ========== Четем масива и го сплитваме по спейс " " ============================================
        // Примерно: Kaloyan Peter Maria Sofia
//        String[] names = scanner.nextLine().split("\\s+");    // Стринг масив, който чете данни на 1 ред

        // ================   Как да прочетем и налеем числа, ако са на един ред?   =====================
        // Примерно: 10 15 20 25 30;
        // ========================== Вариант 1: с for loop =============================================
//        int[] numbers = new int[5];
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = scanner.nextInt();
//        }

        // ========================= Вариант 2: като ги прочетем и сплитнем по спейс " " ===============
        // Примерно: 10 15 20 25 30;
        // Числов масив, който чете данни на 1 ред

        int[] numbers = Arrays.
                stream(scanner.nextLine().split(" "))
                //.mapToInt(e -> Integer.parseInt(e)).toArray();   // вариант 1
                        .mapToInt(Integer::parseInt).toArray();    // шариант 2

        // ========= Как да принтираме масив от числа без да ползваме фор цикъл? =======================

        Arrays.stream(numbers).forEach(е -> System.out.print(е + " "));

        // ======================== Масив от тип "Char" =================================================
        // Вземи този стринг масив и го превърни в масив от символи (чарове).
        //char[] symbols = scanner.nextLine().toCharArray();

        //System.out.println();
    }
}
