package AdvancedConditionalStatesmets.Exercises;

import java.util.Scanner;

public class HotelRoom_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int accommodations = Integer.parseInt(scanner.nextLine());

        double sumApartment = 0.0;
        double sumStudio = 0.0;

        if (month.equals("May") || month.equals("October")) {
            double priceApartment = accommodations * 65;
            double priceStudio = accommodations * 50;
            if (accommodations <= 7){
                sumApartment = priceApartment;
                sumStudio = priceStudio;
            } else if (accommodations > 7 && accommodations <= 14){
                sumStudio = priceStudio * 0.95;
                sumApartment = priceApartment;
            } else if (accommodations > 14){
                sumStudio = priceStudio * 0.7;
                sumApartment = priceApartment * 0.9;
            }
        } else if (month.equals("June") || month.equals("September")){
            double priceApartment = accommodations * 68.70;
            double priceStudio = accommodations * 75.20;
            if (accommodations <= 14) {
                sumApartment = priceApartment;
                sumStudio = priceStudio;
            } else if (accommodations > 14){
                sumStudio = priceStudio * 0.8;
                sumApartment = priceApartment * 0.90;
            }
        } else if (month.equals("July") || month.equals("August")){
            double priceApartment = accommodations * 77;
            double priceStudio = accommodations * 76;
            sumStudio = priceStudio;
            sumApartment = priceApartment;
            if (accommodations > 14){
                sumApartment = priceApartment * 0.9;
            }
        }

        System.out.printf("Apartment: %.2f lv.\n", sumApartment);
        System.out.printf("Studio: %.2f lv.", sumStudio);
    }
}
