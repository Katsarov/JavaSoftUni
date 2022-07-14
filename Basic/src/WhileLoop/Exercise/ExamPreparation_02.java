package WhileLoop.Exercise;

import java.util.Scanner;

public class ExamPreparation_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int poorGrades = Integer.parseInt(scanner.nextLine());

        int totalGrades = 0;
        int gradesSum = 0;
        int poorGradesCounter = 0;
        String lastProblem = "";
        boolean flag = false;

        String input = scanner.nextLine();

        while (!input.equals("Enough")){

            lastProblem = input;
            int grade = Integer.parseInt(scanner.nextLine());

            totalGrades++;
            if(grade <= 4){
                gradesSum += grade;
                poorGradesCounter++;
            } else {
                gradesSum += grade;
            }

            if(poorGradesCounter >= poorGrades){
                flag = true;
                break;
            }

            input = scanner.nextLine();
        }

        double averageScore = gradesSum * 1.0 / totalGrades;
        if(flag){
            System.out.printf("You need a break, %d poor grades.", poorGradesCounter);
        } else {
            System.out.printf("Average score: %.2f\n", averageScore);
            System.out.printf("Number of problems: %d\n", totalGrades);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}
