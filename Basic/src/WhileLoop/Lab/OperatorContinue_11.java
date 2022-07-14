package WhileLoop.Lab;

public class OperatorContinue_11 {
    public static void main(String[] args) {

        // Print only odd numbers between 1 and 10
        int i = 0;
        while (i < 10){
            if(i % 2 == 0){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
