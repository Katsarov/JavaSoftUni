package ExamplesListsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExamplesReadingFromConsole_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитане на стринг - 1
        List<String> names = Arrays.stream(scanner.nextLine().split(" ")).toList();

        // Прочитане на стринг - 2
        //List<String> names2 = Arrays
                //.stream(scanner.nextLine().split("\\s+"))
                //.collect(Collectors.toList());

        // Отпечатване на листа
        System.out.println(String.join(" ;", names));

        // Прочитане на стринг с числа
        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (Integer number : numbers) {
            System.out.printf("%d ", number);
        }

    }
}
