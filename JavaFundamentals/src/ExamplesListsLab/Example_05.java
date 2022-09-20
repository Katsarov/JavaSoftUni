package ExamplesListsLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        // Прочитане и отпечатване на числа
//        List<Integer> list = new ArrayList<>(n);
//        for (int i = 0; i < n; i++) {
//            int number = Integer.parseInt(scanner.nextLine());
//            list.add(number);
//        }
//        for (Integer integer : list) {
//               System.out.println(integer);
//        }


        // Прочитане и отпечатване на стрингове
        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            list.add(word);
        }

        for (String s : list) {
            System.out.println(s);
        }


    }
}
