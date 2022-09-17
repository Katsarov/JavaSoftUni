package ExamplesAssociativeArraysLab;

import java.util.*;

public class ExampleMap_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Integer> digitValues = new TreeMap<>();
        digitValues.put("zero", 0);
        digitValues.put("one", 1);
        digitValues.put("two", 2);
        digitValues.put("three", 3);
        digitValues.put("four", 4);
        digitValues.put("five", 5);

        for (Map.Entry<String, Integer> entry : digitValues.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
