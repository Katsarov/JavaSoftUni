package Examples;

import java.util.Scanner;

public class Arrays_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитаме 1 ред от символи
        String lineNumbers = scanner.nextLine();

        // Ако въведем примерно: 16 32 45, резултата ще изглежда като низ: "16 32 45"

        // Резултатът ще бъде масив, в който всяко число е отделен символен низ
        // Имаме 1 ред от числа, разбий ми го по спейсове на отделни стрингове и ги запиши в този стринг масив -> numbersAsString []
        String [] numbersAsString =  lineNumbers.split("\\s+");
        // Ако в разделителя сложим --> "\\s+" --> това ще елиминира проблема ако имаме повече от един спейса

        // Резултата е: "16""32""45"

        // Как сега да обърнем тези стрингове на числа?
        // Ще си направим един int [] numbers
        // Като дължината му ще бъде дължината на масива от стрингове --> numbersAsString.length
        int [] numbers = new int[numbersAsString.length];

        // В момента стойностите на масива са нули. Как да запълним стойностите с числа?
        // Трчбва да минем през всяка една позиция и да запишем стойност
        // numbers [0] = Integer.parseInt(numbersAsString[0]);

        // Сега ще го направим за всички числа, които ще въведем
        for (int i = 0; i < numbers.length; i++) {
            // На всяка позиция записваме стойност
            numbers[i] = Integer.parseInt(numbersAsString[i]);
        }

        // А сега ще ги отпечатаме
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Важно: По този начин си четем ред от числа
    }
}
