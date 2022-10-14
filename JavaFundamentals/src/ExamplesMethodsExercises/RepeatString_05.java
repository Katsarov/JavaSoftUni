package ExamplesMethodsLab;

import java.util.Scanner;

public class RepeatString_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input
        String s = scanner.nextLine();
        int repetitions = Integer.parseInt(scanner.nextLine());

        // action
        String repeated = repeatString(s, repetitions);

        // output
        System.out.println(repeated);
    }

    private static String repeatString(String s, int repetitions) {
        String[] strings = new String[repetitions];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = s;
        }

        String repeated =  String.join("", strings);

        return repeated;
    }
}
