package ExamplesListsLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example_01 {
    public static void main(String[] args) {
        /*
        Въвеждаме произшолни думи, всяка на отделен ред. Някъде поставяме точка (.)
        Да се прочете текста до . и да се отпечата в обратен ред
         */

        Scanner scanner = new Scanner(System.in);
        List<String> text = new ArrayList<String>();

        String words = scanner.nextLine();

        while (!words.equals(".")){

            text.add(words);

            words = scanner.nextLine();
        }

        for (int i = text.size() - 1; i >= 0; i--) {
            System.out.println(text.get(i));
        }
    }
}
