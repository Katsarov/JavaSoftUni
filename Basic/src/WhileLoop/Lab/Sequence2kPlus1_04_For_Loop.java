package WhileLoop.Lab;

import java.util.Scanner;

public class Sequence2kPlus1_04_For_Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i *= 2, i++) {   // i = i * 2 + 1
            System.out.println(i);
        }
    }
}
