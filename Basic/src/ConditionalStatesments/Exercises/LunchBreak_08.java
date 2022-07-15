package ConditionalStatesments.Exercises;

import java.util.Scanner;

public class LunchBreak_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int chapterTime = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());

        double lunchTime = breakTime * 1.0 / 8;
        double restTime = breakTime * 1.0 / 4;

        double totalRestTime = breakTime - lunchTime - restTime;

        if(totalRestTime >= chapterTime){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", text, Math.ceil(totalRestTime - chapterTime));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", text, Math.ceil(chapterTime - totalRestTime));
        }
    }
}
