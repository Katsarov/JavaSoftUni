package ExamplesAssociativeArraysLab;

import java.util.*;

public class ExampleMap_01 {
    static class Student {
        int facultyNumber;
        String name;
        int age;

        public Student(int facultyNumber, String name, int age) {
            this.facultyNumber = facultyNumber;
            this.name = name;
            this.age = age;
        }

        public int getFacultyNumber() {
            return facultyNumber;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }


    public static void main(String[] args) {
        Map<Integer, Student> students = new HashMap<>();
        students.put(123, new Student(123, "Joro", 30));
        students.put(456, new Student(456, "Pesho", 25));
        students.put(789, new Student(789, "Misho", 42));

        students.remove(789);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter faculty number: ");
        int searchNumber = scanner.nextInt();

        Student result = students.get(searchNumber);

        if (result != null) {
            System.out.println(result.getName());
        } else {
            System.out.println("No such student");
        }
    }
}
