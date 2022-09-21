package ExamplesListsLab;

import java.util.*;

public class ExampleSortedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 13, 3, 6, -3, 55, -21, 6));

        //Collections.sort(numbers);  // -21 -3 3 6 6 10 13 55

        //Collections.reverse(numbers);

        Collections.sort(numbers, (a,b) -> b.compareTo(a));

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}
