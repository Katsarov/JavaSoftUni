package ForPoop.Lab;

import java.util.Scanner;

public class VowelsSum_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int sum = 0;


        for (int i = 0; i <= text.length() -1; i++) {
            int num = 0;
            switch (text.charAt(i)){
                case 'a':
                    num = 1;
                    break;
                case 'e':
                    num = 2;
                    break;
                case 'i':
                    num = 3;
                    break;
                case 'o':
                    num = 4;
                    break;
                case 'u':
                    num = 5;
                    break;
            }
            sum += num;
        }
        System.out.println(sum);
    }
}
