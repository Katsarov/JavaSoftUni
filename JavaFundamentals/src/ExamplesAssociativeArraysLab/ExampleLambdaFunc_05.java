package ExamplesAssociativeArraysLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.stream.Collectors;

public class ExampleLambdaFunc_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> filtered = numbers.stream()
                .filter(n -> n > 2)
                .filter(a -> a < 8)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        for (Integer integer : filtered) {
            System.out.print(integer + " ");
        }


    }
}

