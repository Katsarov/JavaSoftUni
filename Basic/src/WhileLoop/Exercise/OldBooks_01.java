package WhileLoop.Exercise;

import java.util.Scanner;

public class OldBooks_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String book = scanner.nextLine();

        boolean flag = false;
        int counter = 0;

        String input = scanner.nextLine();
        while (!input.equals("No More Books")){

            if(input.equals(book)){
                flag = true;
                break;
            }

            counter++;
            input = scanner.nextLine();
        }

        if(flag){
            System.out.printf("You checked %d books and found it.", counter);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", counter);
        }
    }
}
