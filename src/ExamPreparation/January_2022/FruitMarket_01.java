package ExamPreparation.January_2022;

import java.util.Scanner;

public class FruitMarket_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberryPrice = Double.parseDouble(scanner.nextLine()); // ягоди
        double bananasKilos = Double.parseDouble(scanner.nextLine());  // банани
        double orangesKilos = Double.parseDouble(scanner.nextLine());  // портокали
        double raspberryKilos = Double.parseDouble(scanner.nextLine());  // малини
        double strawberryKilos = Double.parseDouble(scanner.nextLine());  // ягоди

        // цена на ягодите
        double totalPriceStrawberry = strawberryPrice * strawberryKilos;

        // цена на малините
        double priceRaspberrys = strawberryPrice * 0.5;

        // цена на портокалите
        double priceOranges = priceRaspberrys * 0.6;

        // цена на бананите
        double priceBananas = priceRaspberrys * 0.2;

        double totalSum = totalPriceStrawberry + (raspberryKilos * priceRaspberrys) + (orangesKilos * priceOranges) + (bananasKilos * priceBananas);

        System.out.printf("%.2f", totalSum);

    }
}
