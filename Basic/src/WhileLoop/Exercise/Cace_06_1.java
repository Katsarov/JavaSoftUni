package WhileLoop.Exercise;

import java.util.Scanner;

public class Cace_06_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());

        int totalPieces = height * width;

        while (totalPieces >= 0){
            String input = scanner.nextLine();
            if(input.equals("STOP")){
                break;
            }

            int currentPieces = Integer.parseInt(input);
            totalPieces -= currentPieces;
        }

        if(totalPieces > 0){
            System.out.printf("%d pieces are left.", totalPieces);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(totalPieces));
        }
    }
}
