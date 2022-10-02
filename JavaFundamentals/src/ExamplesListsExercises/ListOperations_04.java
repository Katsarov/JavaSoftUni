package ExamplesListsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String line = scanner.nextLine();

        while (!line.equals("End")) {
            String[] data = line.split(" ");
            String command = data[0];

            switch (command) {
                case "Add":
                    int element = Integer.parseInt(data[1]);
                    numbers.add(element);
                    break;
                case "Insert":
                    int number = Integer.parseInt(data[1]);
                    int index = Integer.parseInt(data[2]);

                    if (index < 0 || index >= numbers.size()) {
                        System.out.println("Invalid index");
                    } else {
                        numbers.add(index, number);
                    }
                    break;
                case "Remove":
                    int indexRemove = Integer.parseInt(data[1]);

                    if (indexRemove < 0 || indexRemove >= numbers.size()) {
                        System.out.println("Invalid index");
                    } else {
                        numbers.remove(indexRemove);
                    }

                    break;
                case "Shift":
                    int count = Integer.parseInt(data[2]);
                    shiftLeftRight(numbers, data, count);

            }
            line = scanner.nextLine();
        }

        numbers.forEach(n -> System.out.print(n + " "));
    }

    private static void shiftLeftRight(List<Integer> numbers, String[] data, int count) {
        if (data[1].equals("left")) {
            for (int i = 0; i < count; i++) {
                numbers.add(numbers.get(0));
                numbers.remove(0);
            }
        } else if (data[1].equals("right")) {
            for (int i = 0; i < count; i++) {
                numbers.add(0, numbers.get(numbers.size() - 1));
                numbers.remove(numbers.size() - 1);
            }
        }
    }
}
