package Exam_28052022;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double weightParcel = Double.parseDouble(scanner.nextLine());
        String typeOfService = scanner.nextLine();
        int distance = Integer.parseInt(scanner.nextLine());

        double sumOfParcel = 0;

        switch (typeOfService){
            case "standard":
                if(weightParcel < 1){
                    sumOfParcel = distance * 0.03;
                } else if(weightParcel <= 10){
                    sumOfParcel = distance * 0.05;
                } else if(weightParcel <= 40){
                    sumOfParcel = distance * 0.1;
                } else if(weightParcel <= 90){
                    sumOfParcel = distance * 0.15;
                } else if(weightParcel > 90 && weightParcel <= 150){
                    sumOfParcel = distance * 0.2;
                }
                break;
            case "express":
                if(weightParcel < 1){
                    double addKilos = 0.8 * 0.03;
                    double sum = distance * 0.03;
                    double addKilometers = weightParcel * addKilos;
                    double addCost = distance * addKilometers;
                    sumOfParcel = sum + addCost;
                } else if(weightParcel <= 10){
                    double addKilos = 0.4 * 0.05;
                    double sum = distance * 0.05;
                    double addKilometers = weightParcel * addKilos;
                    double addCost = distance * addKilometers;
                    sumOfParcel = sum + addCost;
                } else if(weightParcel <= 40){
                    double addKilos = 0.05 * 0.1;
                    double sum = distance * 0.1;
                    double addKilometers = weightParcel * addKilos;
                    double addCost = distance * addKilometers;
                    sumOfParcel = sum + addCost;
                } else if(weightParcel <= 90){
                    double addKilos = 0.02 * 0.15;
                    double sum = distance * 0.15;
                    double addKilometers = weightParcel * addKilos;
                    double addCost = distance * addKilometers;
                    sumOfParcel = sum + addCost;
                } else if(weightParcel > 90 && weightParcel <= 150){
                    double addKilos = 0.01 * 0.2;
                    double sum = distance * 0.2;
                    double addKilometers = weightParcel * addKilos;
                    double addCost = distance * addKilometers;
                    sumOfParcel = sum + addCost;
                }
                break;
        }

        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", weightParcel, sumOfParcel);
    }
}
