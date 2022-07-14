package ForLoop.Exercises;

import java.util.Scanner;

public class Salary_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int openTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        int penalties = 0;

        for (int i = 0; i < openTabs; i++) {
            String websiteName = scanner.nextLine();

            if(websiteName.equals("Facebook")){
                penalties += 150;
            } else if(websiteName.equals("Instagram")){
                penalties += 100;
            } else if(websiteName.equals("Reddit")){
                penalties += 50;
            }

            int balance = salary - penalties;
            if (balance <= 0){
                System.out.println("You have lost your salary.");
                return;
            }
        }

        System.out.println(salary - penalties);
    }
}
