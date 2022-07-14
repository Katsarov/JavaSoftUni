package WhileLoop.Lab;

import java.util.Scanner;

public class Password_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals(password)){
            //System.out.printf("Please, try again: ");
            input = scanner.nextLine();
        }
        System.out.printf("Welcome %s!", username);
    }
}
