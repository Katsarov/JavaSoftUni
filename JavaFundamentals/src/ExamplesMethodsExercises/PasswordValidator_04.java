package ExamplesMethodsExercise;

import java.util.Locale;
import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        // Rules
        // 6 – 10 characters (inclusive);
        isPassLengthValid(password); // returns boolean as a result

        // Consists only of letters and digits;
        isConsistOnlyLettersAndDigits(password);    // returns boolean as a result

        // Have at least 2 digits.
        isHasAtLeast2Digits(password);  // returns boolean as a result

        if (isPassLengthValid(password) && isConsistOnlyLettersAndDigits(password) && isHasAtLeast2Digits(password)) {
            System.out.println("Password is valid");
        }

        if (!isPassLengthValid(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        if (!isConsistOnlyLettersAndDigits(password)) {
            System.out.println("Password must consist only of letters and digits");
        }

        if (!isHasAtLeast2Digits(password)) {
            System.out.println("Password must have at least 2 digits");
        }
    }
    public static boolean isPassLengthValid(String pass) {
        return pass.length() >= 6 && pass.length() <= 10;
    }

    public static boolean isConsistOnlyLettersAndDigits(String pass) {
        for (int i = 0; i < pass.length(); i++) {
            char symbol = pass.toLowerCase().charAt(i);
            if((symbol < 48 || symbol > 57) && (symbol < 97 || symbol > 122)){
                return false;
            }
        }
        return true;
    }


    public static boolean isHasAtLeast2Digits(String pass) {
        int count = 0;
        for (int i = 0; i < pass.length(); i++) {
            if((pass.charAt(i) >= 48 && pass.charAt(i) <= 57)){
                count++;
            }
        }
        if(count >= 2){
            return true;
        }
        return false;
    }




}
