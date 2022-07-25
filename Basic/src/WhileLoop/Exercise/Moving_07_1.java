package WhileLoop.Exercise;

import java.util.Scanner;

public class Moving_07_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());

        int volome = height * length * width;

        String input = scanner.nextLine();
        boolean flag = false;

        while (!input.equals("Done")){
            int currentCartoons = Integer.parseInt(input);
            volome -= currentCartoons;

            if(volome <= 0){
                flag = true;
                break;
            }

            input = scanner.nextLine();
        }
        if(flag){
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(volome));
        } else {
            System.out.printf("%d Cubic meters left.", volome);
        }
    }
}
