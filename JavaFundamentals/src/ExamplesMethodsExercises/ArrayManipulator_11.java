package ExamplesMethodsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] arr = Arrays.stream(scanner.nextLine()    // Прочитаме си един int масив директно от конзолата
                        .split(" "))                      // сплитваме го по ""
                .mapToInt(e -> Integer.parseInt(e))      // мпарсваме го към integer
                .toArray();                             // и накрая го превръщаме в масив

        // Ще си прочетем една линия от конзолата
        String line = scanner.nextLine();

        while (!line.equals("end")) {
            String[] data = line.split(" ");
            String command = data[0];

            switch (command) {
                case "exchange":
                    int index = Integer.parseInt(data[1]);
                    if (isValidIndex(index, arr.length)) {
                        // ще си извикаме нов метод "exchange", който ще приема array, index
                        exchange(arr, index);

                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "max":
                    if (data[1].equals("even")) {
                        printEvenMax(arr);
                    } else {
                        printOddMax(arr);
                    }
                    //String even = data[1];
                    //String odd = data[2];
                    break;
                case "min":
                    if (data[1].equals("even")) {
                        printEvenMin(arr);
                    } else {
                        printOddMin(arr);
                    }
                    break;
                case "first":
                    int count = Integer.parseInt(data[1]);
                    if (count > arr.length) {
                        System.out.println("Invalid count");
                    } else {
                        if (data[2].equals("even")) {
                            printFirstEven(arr, count);
                        } else {
                            printFirstOdd(arr, count);
                        }
                    }

                    break;
                case "last":
                    count = Integer.parseInt(data[1]);
                    if (count > arr.length) {
                        System.out.println("Invalid count");
                    } else {
                        if (data[2].equals("even")) {
                            printLastEven(arr, count);
                        } else {
                            printLastOdd(arr, count);
                        }
                    }
                    break;
            }
            line = scanner.nextLine();
        }
        System.out.println(Arrays.toString(arr));
    }

    public static boolean isValidIndex(int index, int length) {
        return index >= 0 && index < length;
    }

    public static void exchange(int[] array, int index) {
        int[] first = new int[index + 1];   // този масив ще пази първата част, от началнич елемент до елемента, подаден по индекса
        int[] second = new int[array.length - index - 1];   // от големината на масива (5) вадим индекса и вадим 1

        // Сега трябва да напълним тези 2 масива, с 2 for цикъла, по един за всеки масив
        // за първия масив
        for (int i = 0; i <= index; i++) {
            first[i] = array[i];    // по този начин сме налели първите N елемента в първия масив
        }

        // сега за втория масив
        for (int i = 0; i < second.length; i++) {
            second[i] = array[index + 1 + i];
        }

        // сега да разменим местата на елементите от двата масива -> елементите от втория масив трябва да дойдат преди елементите от първия масив
        for (int i = 0; i < array.length; i++) {
            if (i < second.length) {
                array[i] = second[i];
            } else {
                array[i] = first[i - second.length];
            }
        }
    }

    public static void printEvenMin(int[] array) {
        int minNumber = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (minNumber >= array[i] && array[i] % 2 == 0) {
                minNumber = array[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }

    }

    public static void printOddMin(int[] array) {
        int minNumber = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (minNumber >= array[i] && array[i] % 2 != 0) {
                minNumber = array[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }

    }

    public static void printEvenMax(int[] array) {
        int maxNumber = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (maxNumber <= array[i] && array[i] % 2 == 0) {
                maxNumber = array[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }

    }

    public static void printOddMax(int[] array) {
        int maxNumber = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (maxNumber <= array[i] && array[i] % 2 != 0) {
                maxNumber = array[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    public static void printFirstEven(int[] array, int count) {
        int[] bufferArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && count > 0) {
                bufferArr[i] = array[i];
                count--;
            } else {
                bufferArr[i] = -1;
            }
        }
        printArr(bufferArr);
    }

    public static void printFirstOdd(int[] array, int count) {
        int[] bufferArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && count > 0) {
                bufferArr[i] = array[i];
                count--;
            } else {
                bufferArr[i] = -1;
            }
        }
        printArr(bufferArr);
    }

    public static void printLastEven(int[] array, int count) {
        // Създаваме си един буферен масив, в който ще пазим стойностите, които ще принтираме
        // Той ще е с дължината на основния масив, който манипулираме => array.length
        int[] bufferArr = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 == 0 && count > 0) {
                bufferArr[i] = array[i];
                count--;
            } else {
                bufferArr[i] = -1;
            }
        }
        printArr(bufferArr);
    }

    public static void printLastOdd(int[] array, int count) {
        // Създаваме си един буферен масив, в който ще пазим стойностите, които ще принтираме
        // Той ще е с дължината на основния масив, който манипулираме => array.length
        int[] bufferArr = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 != 0 && count > 0) {
                bufferArr[i] = array[i];
                count--;
            } else {
                bufferArr[i] = -1;
            }
        }
        printArr(bufferArr);
    }

    // Метод за печат на масив, в който да махнем всички -1
    public static void printArr(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == -1) {
                count++;
            }
        }

        // Буферния масив е с дължината на преброените -1
        int[] buffArr = new int[count];

        boolean isEmpty = true;

        // Минаваме отново през масива, но този път гледаме къде е различно от -1
        for (int i = 0; i < numbers.length - count; i++) {
            buffArr[i] = numbers[i];
            isEmpty = false;
        }
        if (isEmpty) {
            System.out.println("[]");
        } else {
            System.out.println(Arrays.stream(buffArr));
        }
    }
}
