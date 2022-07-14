package Examples;

import java.util.Scanner;

public class StringJoin_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] array = {"one", "two", "three", "four"};

        System.out.println(String.join(" ", array));

        // ====================== Printing without String.join =========================================
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s%n", array[i]);
        }
    }
}
