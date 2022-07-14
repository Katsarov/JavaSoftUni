package ConditionalStatesments.Exercises;

import java.util.Scanner;

public class WorldSwimmingRecord_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeSecondForOneMeter = Double.parseDouble(scanner.nextLine());

        double postponeTime = Math.floor(distance / 15);
        double addTime = postponeTime * 12.5;

        double timeIvan = distance * timeSecondForOneMeter + addTime;

        if(timeIvan < worldRecord){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", timeIvan);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", timeIvan - worldRecord);
        }
    }
}
