package Exam_28052022;

import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int left = n;
        int rev = 0;
        int rev1 = 0;
        int rev2 = 0;

        int r = left % 10;
        rev = rev + r;
        left = left / 10;

        r = left % 10;
        rev1 = rev1 + r;
        left = left / 10;
        r = left % 10;
        rev2 = rev2 + r;

        for (int i = 1; i <=rev; i++)
        {
            for (int y = 1; y <=rev1; y++)
            {
                for (int w = 1; w <=rev2; w++)
                {
                    int result = w * y * i;
                    System.out.printf("%d * %d * %d = %d;\n", i, y, w, result);
                }
            }
        }
    }
}
