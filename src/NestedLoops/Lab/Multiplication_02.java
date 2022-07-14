package NestedLoops.Lab;

public class Multiplication_02 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int multiplicator = i * j;
                System.out.printf("%d * %d = %d\n", i, j, multiplicator);
            }
        }
    }
}
