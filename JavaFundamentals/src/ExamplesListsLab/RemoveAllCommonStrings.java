package ExamplesListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAllCommonStrings {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("abc", "def", "abc", "abc", "def"));

        // Да премахнем всички стрингове "abc"
        removeAll(words, "abc");

        for (String word : words) {
            System.out.print(word + " ");
        }
    }




    // Вариант 1: използваме while
//    private static void removeAll(List<String> elements, String value) {
//        while (elements.remove(value)) {
//        }
//    }

    // Вариант 2: използваме for + while цикли
//    private static void removeAll(List<String> elements, String value) {
//        for (int i = 0; i < elements.size(); i++) {
//            while (elements.get(i).equals(value)){
//                elements.remove(i);
//            }
//        }
//    }

    // Вариант 3: чист while цикъл
    private static void removeAll(List<String> elements, String value) {
        int i = 0;
        while (i < elements.size()){
            if(elements.get(i).equals(value)){
                elements.remove(i);
            } else {
                i++;
            }
        }
    }
}
