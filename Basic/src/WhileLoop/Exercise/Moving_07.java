package WhileLoop.Exercise;

import java.util.Scanner;

public class Moving_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());

        int volome = height * length * width;

        while (volome >= 0){
            String input = scanner.nextLine();
            if(input.equals("Done")){
                break;
            }
            int cartoonNums = Integer.parseInt(input);
            volome -= cartoonNums;
        }

        if(volome > 0){
            System.out.printf("%d Cubic meters left.", volome);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(volome));
        }
    }
}
