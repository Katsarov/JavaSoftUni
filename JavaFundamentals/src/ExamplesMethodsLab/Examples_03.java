package ExamplesMethodsLab;

import java.util.Scanner;

public class Examples_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // метод за четене на ред от конзолата и отделяне на думите в стринг масив
        // да сплитнем следния ред с думи:
        // hello how are you goodbye

        // това ще ни го сплитне по " "
        //String[] words =  readLineOfWords(scanner, " ");

        // това ще ни го сплитне по ", "
        String[] words =  readLineOfWords(scanner, ", ");


        for (String word : words) {
            System.out.println(word);
        }


    }
    
    private static String[] readLineOfWords(Scanner scanner){
        return  readLineOfWords(scanner, " ");
    }

    private static String[] readLineOfWords(Scanner scanner, String splitByRegex) {
        String line = scanner.nextLine();
        return line.split(splitByRegex);
    }
}
