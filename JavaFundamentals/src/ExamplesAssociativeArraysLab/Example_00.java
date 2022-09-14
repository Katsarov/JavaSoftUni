package ExamplesAssociativeArraysLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example_00 {
    static class Student{
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
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(123, "Joro", 30));
        students.add(new Student(456, "Pesho", 25));
        students.add(new Student(789, "Misho", 42));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter faculty number: ");
        int searchNumber = scanner.nextInt();

        Student result = null;
        for (Student student : students) {
            if(student.getFacultyNumber() == searchNumber){
                result = student;
            }
        }
        if(result != null){
            System.out.println(result.getName());
        } else {
            System.out.println("No such student");
        }
    }
}
