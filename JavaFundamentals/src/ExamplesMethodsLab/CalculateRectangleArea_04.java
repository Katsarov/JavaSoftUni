package ExamplesMethodsLab;

import java.util.Scanner;

public class CalculateRectangleArea_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int area = calculateArea(a, b);
        System.out.println(area);
    }

    private static int calculateArea(int a, int b) {
        return a * b;
    }
}
