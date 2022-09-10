package ExamplesArraysExercises;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] firstArray = scanner.nextLine().split("\\s+");
        String [] secondArray = scanner.nextLine().split("\\s+");

        for (int i = 0; i < secondArray.length; i++) {
            for (int j = 0; j < firstArray.length; j++) {
                if(firstArray[j].equals(secondArray[i])){
                    System.out.print(firstArray[j] + " ");
                }
            }
        }
    }
}
