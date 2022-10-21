package ExamplesMethodsLab;

import java.util.Scanner;

public class Examples_00 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello!");
        printingDebugLine(20, '*');
        // ********************

        String lineOfNumbers = scanner.nextLine();
        int[] elements = parseIntArray(lineOfNumbers);

        System.out.println(elements.length);
        printingDebugLine(40);
        // ----------------------------------------

        int min =  findMin(elements);

        System.out.println(min);
        printingDebugLine(60, '=');
        // ============================================================

        parseIntArray(lineOfNumbers);
    }

    // да прочетем масив от числа от конзолата
    // 1. трябва ни метода Scanner
    // 2. прочитаме си един ред от конзолата
    // 3. този ред трябва да го преобразуваме в масив от елементи
    // 4. пускаме си един цикъл с който да обходим масива elements и на всеки elements[i] да му присвоим стойност numbersString[i]
    private static int[] parseIntArray(String lineOfNumbers) {
        String[] numbersStrings = lineOfNumbers.split("\\s+");
        int[] intArray = new int[numbersStrings.length];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.parseInt(numbersStrings[i]);
        }
        return intArray;
    }

    // метод за принтиране на разделител със символ '-'
    static  void printingDebugLine(int dividerLength){
        printingDebugLine(dividerLength, '-');
    }

    // метод за принтиране на разделител със зададени от потребителя дължина и символ
    static  void printingDebugLine(int dividerLength, char symbol){

        for (int i = 0; i < dividerLength; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }

    // метод за намиране на най-малкото число
    static int findMin (int[] elements){
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < elements.length; i++) {
            if(min > elements[i]){
                min = elements[i];
            }
        }
        // връщане на стойност от метод
        return min;
    }
}
