package ExamplesMethodsLab;

import java.util.Scanner;

public class Examples_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // да намерим индекса на дума в поредица от думи.
        // Ако няма такава дума, да ни върне -1

        String[] words = new String[] {"swedish", "vegans", "marching", "ashore"};

        String searchWord = "vegansa";
        int index =  findIndex(words, searchWord);

        System.out.println(index);

//        String word = findWord(words, searchWord);
//
//        System.out.println(word);
    }

    private static String findWord(String[] words, String searchWord) {
        for (int i = 0; i < words.length; i++) {
            if(words[i].equals(searchWord)){
                return words[i];
            }
        }
        return "Not found";
    }

    private static int findIndex(String[] words, String searchWord) {
        for (int i = 0; i < words.length; i++) {
            if(words[i].equals(searchWord)){
                return i;
            }
        }

        return  -1;
    }
}
