package ExamplesAssociativeArraysLab;

import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитаме си входа
        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Map<Integer, Integer> numberCounts = new TreeMap<>();

        // Да минем по листа с numbers и за всеки един number да запишем колко пъти е срещнат
        for (Integer number : numbers) {
            Integer currentCount = numberCounts.get(number);
            if(currentCount != null){
                numberCounts.put(number, currentCount + 1);
            } else {
                numberCounts.put(number, 1);
            }
        }

        // Как ги извеждаме?
        for (Map.Entry<Integer, Integer> entry : numberCounts.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
