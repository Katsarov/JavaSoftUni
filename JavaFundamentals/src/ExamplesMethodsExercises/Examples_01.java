package ExamplesMethodsExercise;

import java.util.Scanner;

public class Examples_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        print();

        String name = "Peter";
        int age = 25;
        printPersonData(name, age);

        print();

        String data = parsePersonData(name, age);
        System.out.println(data);

        print();

        //int a = Integer.parseInt(scanner.nextLine());
        //int b = Integer.parseInt(scanner.nextLine());
        //int summa = sumNumbers(a, b);
        //System.out.println(summa);

        // Метод за събиране на 2 числа
        System.out.println(sumNumbers(age, age));

        // Метод за събиране на 3 числа
        System.out.println(sumNumbers(20, 15, 55));

        //Метод за събиране на N на брой числа
        System.out.println(sumNumbers(2, 3, 5, 6, 8, 22, 33, 44, 55));
    }

    // Събиране на N на брой числа
    private static int sumNumbers(int...nums){
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    // Събиране на 2 числа
    private static int sumNumbers(int a, int b){
        return a + b;
    }

    // Method overload - събиране на 3 числа
    private static int sumNumbers(int a, int b, int c){
        return a + b + c;
    }

    // Отпечатване на име и възраст от стринг
    private static String parsePersonData(String name, int age){
        // Вариант 1: дълго разписване
//        String result = "";
//        result = String.format("Name is: %s\nAge is: %d", name, age);
//        return result;

        // Вариант 2: кратко изписване
        return String.format("Name is: %s\nAge is: %d", name, age);
    }

    private static void printPersonData(String name, int age) {
        System.out.printf("Name is: %s\nAge is: %d\n", name, age);
    }

    private static void print() {
        System.out.println("------------\n");
    }

}
