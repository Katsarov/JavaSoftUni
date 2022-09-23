package ExamplesListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MergingLists_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Сливане на 2 сортирани списъка
        List<Integer> sortedA = nextLineOfInts(scanner);   // 10 6 3 2 1
        List<Integer> sortedB = nextLineOfInts(scanner);   //  9 8 4 0

        int indexA = 0;
        int indexB = 0;

        List<Integer> mergedList = new ArrayList<>();

        while (indexA < sortedA.size() || indexB < sortedB.size()) {

            if (indexA < sortedA.size() && sortedA.get(indexA) > sortedB.get(indexB)) {
                mergedList.add(sortedA.get(indexA));
                indexA++;
            } else {
                mergedList.add(sortedB.get(indexB));
                indexB++;
            }
        }

        for (Integer number : mergedList) {
            System.out.print(number + " ");
        }


        //        for (int integerA : numbersA) {
//            System.out.print(integerA + " ");
//        }
//
//        System.out.println();
//
//        for (Integer integerB : numbersB) {
//            System.out.print(integerB + " ");
//        }
    }

    private static List<Integer> nextLineOfInts(Scanner scanner) {
        List<Integer> numbers = new ArrayList<>();

        String[] input = scanner.nextLine().split(" ");
//        String input = scanner.nextLine();
//        String[] splittedInput = input.split(" ");

        for (String s : input) {
            numbers.add(Integer.parseInt(s));
        }
        return numbers;
    }
}


























