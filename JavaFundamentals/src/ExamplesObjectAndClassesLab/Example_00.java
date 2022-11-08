package ExamplesObjectAndClassesLab;

public class Example_00 {

    static class Student{
        int id;
        String name;
        int age;

        // Конструктор
        Student (String name, int id, int age){
            this.name = name;
            this.id = id;
            this.age = age;
        }

        // Метод за получаване на инфото за студента
        String getInfo() {
            return "age: " + this.age + ", " + "ID: " + this.id + ", " + "name: " + this.name;
        }
    }

    public static void main(String[] args) {

        Student a = new Student("Joro", 12345678, 30);
        System.out.println(a.getInfo());

        System.out.println();

        Student b = new Student("Pesho", 10101010, 25);
        System.out.println(b.getInfo());

    }
}

