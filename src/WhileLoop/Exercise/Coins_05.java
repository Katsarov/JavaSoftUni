package WhileLoop.Exercise;

import java.util.Scanner;

public class Coins_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double restMoney = Double.parseDouble(scanner.nextLine());

        int coinCounter = 0;

        while (restMoney != 0 * 1.0){
            if(restMoney >= 2.0){
                restMoney -= 2;
                coinCounter++;
            } else if(restMoney >= 1 * 1.0){
                restMoney -= 1.0;
                coinCounter++;
            } else if(restMoney >= 0.50 * 1.0){
                restMoney -= 0.5;
                coinCounter++;
            } else if(restMoney >= 0.20 * 1.0){
                restMoney -= 0.2;
                coinCounter++;
            }else if(restMoney >= 0.10 * 1.0) {
                restMoney -= 0.1;
                coinCounter++;
            } else if(restMoney >= 0.05 * 1.0) {
                restMoney -= 0.05;
                coinCounter++;
            } else if(restMoney >= 0.02 * 1.0) {
                restMoney -= 0.02;
                coinCounter++;
            } else if(restMoney >= 0.01 * 1.0) {
                restMoney -= 0.01;
                coinCounter++;
            } else {
                break;
            }
        }

        System.out.println(coinCounter);
    }
}
