package Exam_28052022;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int tripSea = Integer.parseInt(scanner.nextLine());
        int tripMountain = Integer.parseInt(scanner.nextLine());

        double profit = 0;

        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            if(input.equals("Stop")){
                break;
            }

            if (input.equals("sea") && tripSea != 0) {
                profit += 680.0;
                tripSea--;

            } else if (input.equals("mountain") && tripMountain != 0) {
                    profit += 499.0;
                    tripMountain--;

            }

            if(tripSea == 0 ){
                if(tripMountain == 0){
                    break;
                }
            }
            if(tripMountain == 0){
                if(tripSea == 0){
                    break;
                }
            }

            input = scanner.nextLine();
        }

        if (!input.equals("Stop")){
            System.out.printf("Good job! Everything is sold.\n");
            System.out.printf("Profit: %.0f leva.", profit);
        } else {
            System.out.printf("Profit: %.0f leva.", profit);
        }
    }
}
