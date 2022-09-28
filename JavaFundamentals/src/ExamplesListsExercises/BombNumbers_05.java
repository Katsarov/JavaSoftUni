package ExamplesListsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> sequense = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        String[] data = input.split(" ");

        int bombNumber = Integer.parseInt(data[0]);
        int power = Integer.parseInt(data[1]);

        while (sequense.contains(bombNumber)){
            int bombIndex = sequense.indexOf(bombNumber);
            int start = bombIndex - power;
            int end = bombIndex + power;

            if( start < 0){
                start = 0;
            }
            if(end >= sequense.size()){
                end = sequense.size() -1;
            }

            for (int i = start; i <= end; i++) {
                sequense.remove(start);
            }
        }
        int sum = 0;
        for (Integer integer : sequense) {
            sum+= integer;
        }

        System.out.println(sum);
    }
}
