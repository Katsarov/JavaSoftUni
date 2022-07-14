package ForLoop.Exercises;

import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nGroups = Integer.parseInt(scanner.nextLine());

        int totalPeople = 0;
        int groupMusala = 0;
        int groupMontblan = 0;
        int groupKilimandzharo = 0;
        int groupK2 = 0;
        int groupEverest = 0;

        for (int i = 0; i < nGroups; i++) {
            int group = Integer.parseInt(scanner.nextLine());

            if (group <= 5){
                groupMusala += group;
            } else if(group >= 6 && group <= 12){
                groupMontblan += group;
            } else if(group >= 13 && group <= 25){
                groupKilimandzharo += group;
            } else if(group >= 26 && group <= 40){
                groupK2 += group;
            } else if(group >= 41){
                groupEverest += group;
            }
            totalPeople += group;
        }

        double groupPeopleMusala = (1.0 * groupMusala / totalPeople) * 100;
        double groupPeopleMontblan = (1.0 * groupMontblan / totalPeople) * 100;
        double groupPeopleKilimandzharo = (1.0 * groupKilimandzharo / totalPeople) * 100;
        double groupPeopleK2 = (1.0 * groupK2 / totalPeople) * 100;
        double groupPeopleEverest = (1.0 * groupEverest / totalPeople) * 100;

        System.out.printf("%.2f%%\n", groupPeopleMusala);
        System.out.printf("%.2f%%\n", groupPeopleMontblan);
        System.out.printf("%.2f%%\n", groupPeopleKilimandzharo);
        System.out.printf("%.2f%%\n", groupPeopleK2);
        System.out.printf("%.2f%%\n", groupPeopleEverest);
    }
}
