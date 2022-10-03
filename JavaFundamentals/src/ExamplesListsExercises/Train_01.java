package ExamplesListsExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .toList();

        int maxCapacity = Integer.parseInt(scanner.nextLine());


        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] splitted = input.split(" ");

            if (splitted[0].equals("Add")) {
                inputList.add(Integer.parseInt(splitted[1]));
            } else {
                int inputNumber = Integer.parseInt(splitted[0]);

                for (int i = 0; i < inputList.size(); i++) {
                    if (inputNumber + inputList.get(i) <= maxCapacity) {
                        inputList.set(i, inputNumber + inputList.get(i));
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }
        for (Integer output : inputList) {
            System.out.print(output + " ");
        }
    }
}
