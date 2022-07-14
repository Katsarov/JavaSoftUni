package NestedLoops.Exercises;

import java.util.Scanner;

public class TrainTheTrainers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String namePresent = scanner.nextLine();

        double averageGrade = 0;
        double gradeCounter = 0;
        double counter = 0;
        double sumGrade = 0;
        double allGrade = 0;

        while (!namePresent.equals("Finish")) {
            sumGrade = 0;
            for (gradeCounter = 1.00; gradeCounter <= people; gradeCounter++) {
                double grade = Double.parseDouble(scanner.nextLine());

                allGrade += grade;
                sumGrade += grade;
                counter++;
                if (gradeCounter == people) {
                    averageGrade = sumGrade / people;
                    break;
                }
            }

            System.out.printf("%s - %.2f.%n", namePresent, averageGrade);

            namePresent = scanner.nextLine();
        }
        double totalGrade = allGrade / counter;
        System.out.printf("Student's final assessment is %.2f.", totalGrade);
    }
}
