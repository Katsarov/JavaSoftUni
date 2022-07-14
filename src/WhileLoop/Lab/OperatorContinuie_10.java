package WhileLoop.Lab;

import java.util.Scanner;

public class OperatorContinuie_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        // Kaloyan, Asen, Petya, Miro

        // Ако искаме да пропуснем Asen, но програмата да продължи, използваме оператора "continue"
        while (!input.equals("Stop")){
            if (input.equals("Asen")){
                input = scanner.nextLine();
                continue;
            }
            System.out.printf("Hi %s, you get 10%% discount!\n", input);

            input = scanner.nextLine();
        }
    }
}
