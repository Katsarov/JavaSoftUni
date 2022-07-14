package AdvancedConditionalStatesments.Lab;

import java.util.Scanner;

public class TradeCommissions_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String townName = scanner.nextLine();
        double salesVolume = Double.parseDouble(scanner.nextLine());
        double comission = 0.0;

        if (townName.equals("Sofia")) {
            if (salesVolume >0 && salesVolume <= 500) {
                comission = salesVolume * 0.05;
            } else if (salesVolume > 500 && salesVolume <= 1000) {
                comission = salesVolume * 0.07;
            } else if (salesVolume > 1000 && salesVolume <= 10000) {
                comission = salesVolume * 0.08;
            } else if (salesVolume > 10000) {
                comission = salesVolume * 0.12;
            } else {
                System.out.println("error");
            }
        } else if (townName.equals("Varna")) {
            if (salesVolume >0 && salesVolume <= 500) {
                comission = salesVolume * 0.045;
            } else if (salesVolume > 500 && salesVolume <= 1000) {
                comission = salesVolume * 0.075;
            } else if (salesVolume > 1000 && salesVolume <= 10000) {
                comission = salesVolume * 0.1;
            } else if (salesVolume > 10000) {
                comission = salesVolume * 0.13;
            } else {
                System.out.println("error");
            }
        } else if (townName.equals("Plovdiv")) {
             if (salesVolume >0 && salesVolume<= 500) {
                comission = salesVolume * 0.055;
            } else if (salesVolume > 500 && salesVolume <= 1000) {
                comission = salesVolume * 0.08;
            } else if (salesVolume > 1000 && salesVolume <= 10000) {
                comission = salesVolume * 0.12;
            } else if (salesVolume > 10000) {
                comission = salesVolume * 0.145;
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }

        if (comission != 0){
            System.out.printf("%.2f", comission);
        }
    }
}


