package ExamplesListsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String line = scanner.nextLine();

        while (!line.equals("end")){

            String[] data = line.split("\\s+");

            if(data[0].equals("Delete")){
                deleteIntegers(numbers, data);
            } else if(data[0].equals("Insert")){
                insertIntegers(numbers, data);
            }

            line = scanner.nextLine();
        }

        numbers.forEach(e -> System.out.print( e + " "));
    }

    private static void insertIntegers(List<Integer> numbers, String[] data) {
        int element = Integer.parseInt(data[1]);
        int position = Integer.parseInt(data[2]);
        numbers.add(position, element);
    }

    private static void deleteIntegers(List<Integer> numbers, String[] data) {
        int element = Integer.parseInt(data[1]);
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i).equals(element)){
                numbers.remove(i);
                i--;
            }
        }
    }
}
