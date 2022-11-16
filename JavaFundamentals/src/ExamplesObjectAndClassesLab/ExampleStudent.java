package ExamplesObjectAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExampleStudent {
    static class Student {
        String firstName;
        String lastName;
        int age;
        String city;

        public Student(String firstName, String lastName, int age, String city) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.city = city;
        }

        boolean isFrom(String city) {
            return this.city.equals(city);
        }

        String getInfo() {
            //return this.firstName + " " + this.lastName + " " + "is " + this.age + " years old.";
            // Това ни връща на текущия обект имената и възрастта.
            return  String.format("%s %s is %d years old.", this.firstName, this.lastName, this.age);
        }

        String getFirstName(){
            return this.firstName;
        }

        String getLastName(){
            return this.lastName;
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        while (!line.equals("end")) {
            // Input:   {firstName} {lastName} {age} {hometown}
            String[] studentParams = line.split("\\s+");
            String firstName = studentParams[0];
            String lastName = studentParams[1];
            int age = Integer.parseInt(studentParams[2]);
            String city = studentParams[3];

            // If student exists, override it
            int index = indexOfStudent(students, firstName, lastName);
            if(index == -1){
                // Read student and add him to the list
                students.add(new Student(firstName, lastName, age, city));
            } else {
                students.set(index, new Student(firstName, lastName, age, city));
            }




            line = scanner.nextLine();
        }

        String city = scanner.nextLine();
        for (Student student : students) {
            if (student.isFrom(city)) {
                System.out.println(student.getInfo());
            }
        }

        // Print students from that city
    }

    private static int indexOfStudent(List<Student> students, String firstName, String lastName) {
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if(s.getFirstName().equals(firstName) && s.getLastName().equals(lastName)){
                return i;
            }
        }

        return -1;
    }
}
