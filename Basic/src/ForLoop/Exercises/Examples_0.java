package ForLoop.Exercises;

public class Examples_0 {
    public static void main(String[] args) {
        int a = 1;

//        System.out.println(--a);
//        System.out.println(a);

//        System.out.println(a--);
//        System.out.println(a);

//        System.out.println(++a);
//        System.out.println(a);

//        System.out.println(a++);
//        System.out.println(a);

        String input = "Hello";

        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            System.out.println(letter);
        }
    }
}
