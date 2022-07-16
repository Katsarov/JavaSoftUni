package AdvancedConditionalStatesments.Lab;

import java.util.Scanner;

public class SmallShop_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double sum = 0.0;

        switch (town) {
            case "Sofia":
                if (product.equals("coffee")) {
                    sum = 0.50;
                } else if (product.equals("water")) {
                    sum = 0.80;
                } else if (product.equals("beer")) {
                    sum = 1.20;
                } else if (product.equals("sweets")) {
                    sum = 1.45;
                } else if (product.equals("peanuts")) {
                    sum = quantity * 1.60;
                }
                break;
            case "Plovdiv":
                if (product.equals("coffee")) {
                    sum = 0.40;
                } else if (product.equals("water")) {
                    sum = 0.70;
                } else if (product.equals("beer")) {
                    sum = 1.15;
                } else if (product.equals("sweets")) {
                    sum = 1.30;
                } else if (product.equals("peanuts")) {
                    sum = 1.50;
                }
                break;
            case "Varna":
                if (product.equals("coffee")) {
                    sum = 0.45;
                } else if (product.equals("water")) {
                    sum = 0.70;
                } else if (product.equals("beer")) {
                    sum = 1.10;
                } else if (product.equals("sweets")) {
                    sum = 1.35;
                } else if (product.equals("peanuts")) {
                    sum = 1.55;
                }
                break;
        }

        System.out.println(quantity * sum);
    }
}
