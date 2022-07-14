package ConditionalStatesments.Lab;

import java.util.Scanner;

public class AreaOfFigures_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();
        double result = 0.0;
        if (figure.equals("square")) {
            double side = Double.parseDouble(scanner.nextLine());
            result = side * side;
        } else if (figure.equals("rectangle")) {
            double side1 = Double.parseDouble(scanner.nextLine());
            double side2 = Double.parseDouble(scanner.nextLine());
            result = side1 * side2;
        } else if (figure.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            result = Math.PI * radius * radius;
        } else if (figure.equals("triangle")) {
            double base = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            result = base * height / 2;
        }
        System.out.printf("%.3f", result);
    }
}
