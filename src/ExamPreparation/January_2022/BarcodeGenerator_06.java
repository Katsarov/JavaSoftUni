package ExamPreparation.January_2022;

import java.util.Scanner;

public class BarcodeGenerator_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        int firstStart = start / 1000;
        int secondStart = (start / 100) % 10;
        int thirdStart = (start / 10) % 10;
        int fourthStart = start % 10;

        int firstEnd = end / 1000;
        int secondEnd = (end / 100) % 10;
        int thirdEnd = (end / 10) % 10;
        int fourthEnd = end % 10;

        for (int i = firstStart; i <= firstEnd; i++)
        {
            for (int j = secondStart; j <= secondEnd; j++)
            {
                for (int k = thirdStart; k <= thirdEnd; k++)
                {
                    for (int l = fourthStart; l <= fourthEnd; l++)
                    {
                        if (i % 2!= 0 && j % 2 != 0 && k %2 != 0 && l % 2 !=0 )
                        {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}
