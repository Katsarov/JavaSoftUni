package ExamplesListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Example_04 {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>(Arrays.asList("abc", "def", "abc", "abc", "def"));

        int index = words.indexOf("djv");

        if(index == -1){
            System.out.println("not found");
        } else {
            System.out.println("found");
        }


        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
