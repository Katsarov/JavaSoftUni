package ForLoop.Exercises;

public class NumbersEndingInSeven_01 {
    public static void main(String[] args) {

        // Solution 1
//        for (int i = 7; i <= 1000; i+= 10) {
//                System.out.println(i);
//        }

        // Solution 2
        for (int i = 0; i < 1000; i++) {
            if (i % 10 == 7){
                System.out.println(i);
            }
        }
    }
}
