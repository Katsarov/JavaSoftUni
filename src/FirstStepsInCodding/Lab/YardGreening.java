package FirstStepsInCodding.Lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        //System.out.print("Please enter square meters: ");
        //read input
        double yardSquareMeters = Double.parseDouble(scanner.nextLine());

        //calculations
        double pricePerSquareMeter = 7.61;
        double totalPrice = yardSquareMeters * pricePerSquareMeter;

        double finalPrice = totalPrice * 0.82;
        double discount = totalPrice * 0.18;

        //print output
        //•	"The final price is: {крайна цена на услугата} lv."
        //•	"The discount is: {отстъпка} lv."
        System.out.printf("The final price is: %f lv.%n", finalPrice);
        System.out.printf("The discount is: %f lv.", discount);
        //System.out.println($"The final price is:  {finalPrice:f2}  lv.");
        //System.out.println("The discount is: "+discount+ " lv.");
    }
}
