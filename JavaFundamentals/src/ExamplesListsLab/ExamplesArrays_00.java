package ExamplesListsLab;

public class ExamplesArrays_00 {
    public static void main(String[] args) {
        String[] words = new String[]{"swedish", "vegans", "marching", "ashore"};

        // отпечатване на думата с индекс 1 // vegans
        System.out.println(words[1]);

        // преименуване на думата swedish, която е с индекс 0 ==> kilimandjaro
        words[0] = "kilimandjaro";

        // отпечатване на първата дума --> kilimandjaro
        System.out.println(words[0]);
        System.out.println();

        // обхождане на масива и отпечатване на всички думи, всяка на нов ред
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
