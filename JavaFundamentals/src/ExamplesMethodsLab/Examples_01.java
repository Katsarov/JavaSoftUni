package ExamplesMethodsLab;

import java.util.Scanner;

public class Examples_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ========= Прочитаме стринг от конзолата
//        String name = scanner.nextLine();
//        printHello(name);

        // ========== Въвеждаме число, до което да се отпечатат числата от 1 до n
//        int n = Integer.parseInt(scanner.nextLine());
//        printNumbersTo100OrN(n);

        // ========= масив от числа, където имаме и такива с отрицателна стойност

        int[] numbers = new int[]{1, 2, -3, 4, -5, 6, 7};
        setAllNegativeToZero(numbers);

        printArray(numbers);

        // increment number
//        int x = 5;
//        incrementNumber(5);
//        System.out.println(x);

    }

    static  void incrementNumber(int x){
        x++;
    }

    // метод за принтиране на числата от масива []numbers
    private static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    // метод за сетване на всички отрицателни числа на 0
    static void setAllNegativeToZero(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < 0){
                numbers[i] = 0;
            }
        }
    }

    // метод за принтиране на числата от 1 до 100, като могат да бъдат отпечатани само до числото n, което се въвевда от конзолата
    static  void printNumbersTo100OrN(int n){
        for (int i = 1; i <= 100; i++) {
            if(i == n){
                return;
            }
            //System.out.println(i);
        }
    }

    // метод за принтиране на Hello + име, въведено от конзолата
    public static void printHello(String symbol){
        System.out.println("Hello, " + symbol);
    }




}
