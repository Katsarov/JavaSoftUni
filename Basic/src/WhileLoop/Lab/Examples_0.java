package WhileLoop.Lab;

import java.util.Scanner;

public class Examples_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //==========================  For Loop ==================================
        // 3 conditions: start / stop / update
        // Print the numbers from 1 to 10

//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }

        //========================= While Loop =================================

//        int i = 1;
//        while (i <= 10){
//            System.out.println(i);
//            i++;
//        }

        //=============================== Example 1 =============================

//        int a = 5;
//        while (true){
//            if (a > 10){
//                break;
//            }
//            System.out.println("a = " + a);
//            a++;
//        }

        //=============================== Example 2 ============================

//        String input = scanner.nextLine();
//
//        while (!input.equals("Stop")){
//            System.out.println("Infinity loop!");
//            input = scanner.nextLine();
//        }

        //============================== Example 3 ===============================

//        String input = scanner.nextLine();
//
//        while (!input.equals("stop")){
//            if(input.equals("Sofia")){
//                System.out.printf("We found out: %s", input);
//                break;
//            }
//            System.out.println("Name: " + input);
//
//            input = scanner.nextLine();
//        }

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int multiplicator = i * j;
                System.out.printf("%d * %d = %d\n", i, j, multiplicator);
            }
        }
    }
}
