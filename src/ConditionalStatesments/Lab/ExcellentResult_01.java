package ConditionalStatesments.Lab;

import java.util.Scanner;

public class ExcellentResult_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = Integer.parseInt(scanner.nextLine());

        if (result >= 5){
            System.out.println("Excellent!");
        }
    }
}
