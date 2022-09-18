package ExamplesAssociativeArraysLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExampleLambdaFunc_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> result = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());

        for (Integer integer : result) {
            System.out.print(integer + " ");
        }
    }
}
