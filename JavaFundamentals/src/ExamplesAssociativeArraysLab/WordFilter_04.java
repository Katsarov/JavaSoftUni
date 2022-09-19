package ExamplesAssociativeArraysLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WordFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String[] split = line.split("\\s+");

        List<String> result = Arrays.stream(split)
                .filter(s -> s.length() % 2 == 0)
                .collect(Collectors.toList());

        for (String s : result) {
            System.out.println(s);
        }
    }
}
