package ExamplesListsLab;

import java.util.ArrayList;
import java.util.List;

public class Example_02 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);

//        for (int i = 0; i < numbers.size(); i++) {
//            System.out.println(numbers.get(i));
//        }


        for (Integer number : numbers) {
            System.out.println(number);
        }


    }
}
