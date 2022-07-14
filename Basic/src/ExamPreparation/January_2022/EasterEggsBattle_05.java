package ExamPreparation.January_2022;

import java.util.Scanner;

public class EasterEggsBattle_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggsOne = Integer.parseInt(scanner.nextLine());
        int eggsTwo = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        boolean isSecondWin = false;
        boolean isFirstWin = false;

        while (!input.equals("End")){

            if(input.equals("one")){
                eggsTwo -= 1;
            } else if(input.equals("two")){
                eggsOne -= 1;
            }

            if(eggsOne == 0){
                //System.out.printf("Player one is out of eggs. Player two has %d eggs left.\n", eggsTwo);
                isSecondWin = true;
                break;
            } else  if(eggsTwo == 0){
                isFirstWin = true;
                //System.out.printf("Player two is out of eggs. Player one has %d eggs left.\n", eggsOne);
                break;
            }

            input = scanner.nextLine();
        }

        if(isSecondWin){
            System.out.printf("Player one is out of eggs. Player two has %d eggs left.\n", eggsTwo);
        } else if(isFirstWin){
            System.out.printf("Player two is out of eggs. Player one has %d eggs left.\n", eggsOne);
        } else if(input.equals("End")){
            System.out.printf("Player one has %d eggs left.\n", eggsOne);
            System.out.printf("Player two has %d eggs left.\n", eggsTwo);
        }
    }
}
