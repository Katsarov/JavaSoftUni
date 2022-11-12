package ExamplesObjectAndClassesLab;

import java.util.Date;
import java.util.Random;

public class Example_05 {
    public static void main(String[] args) {
//        Random r = new Random();
//
//        System.out.println(r.nextInt(10));
//        System.out.println(r.nextInt(10));
//        System.out.println(r.nextInt(10));
//        System.out.println(r.nextInt(10));
//        System.out.println(r.nextInt(100));
//        System.out.println(r.nextInt(1000));
//        System.out.println(r.nextInt(1000));




        // Колко бързо ще се завърти този цикъл???
        // Как да ГО ИЗМЕРИМ?

        int x = 0;
        Date start = new Date();
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                x *= i;
            }
        }
        Date end = new Date();
        System.out.println(end.getTime() - start.getTime());
        System.out.println(x);
    }
}
