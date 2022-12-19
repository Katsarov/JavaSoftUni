package ExamplesObjectAndClassesExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll_033 {

    static  class Person{
        // Fields
        String name;
        int age;

        // Constructor
        Person(String name, int age){
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        // Method 'Override'
        @Override
        public String toString() {
            return  String.format("%s - %d", this.name, this.age);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);

            Person person = new Person(name, age);
            people.add(person);
        }
        people.stream()
                .sorted((p1,p2) -> Integer.compare(p1.getAge(), p2.getAge()))
                .forEach(p -> System.out.println(p.toString()));

    }
}
