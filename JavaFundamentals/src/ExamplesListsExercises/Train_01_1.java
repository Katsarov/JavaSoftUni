package ExamplesListsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> train = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String line = scanner.nextLine();

        while (!line.equals("end")){
            String[] data = line.split("\\s+");
            if(data[0].equals("Add")){
                train.add(Integer.parseInt(data[1]));
            } else {
                int passengers = Integer.parseInt(data[0]);
                for (int i = 0; i < train.size(); i++) {
                    if(train.get(i) + passengers <= maxCapacity){
                        train.set(i, train.get(i) + passengers);
                        break;
                    }
                }
            }


            line = scanner.nextLine();

        }

        // Отпечатване: вариант 1
//        for (Integer num : train) {
//            System.out.print(num + " ");
//        }

        // Отпечатване: вариант 2
        train.forEach(e -> System.out.print(e + " "));

    }
}
