package ExamplesObjectAndClassesLab;

public class Example_01 {
    static class Animal {
        int age;
        String name;
        int id;
        String type;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        Animal(int age, String name, int id, String type) {
            this.age = age;
            this.name = name;
            this.id = id;
            this.type = type;
        }

        String getInfo() {
            return "Age: " + this.age + " | " + "Name: " + this.name + " | " + "ID: " + this.id + " | " + "Type: " + this.type;
        }
    }


    public static void main(String[] args) {
        Animal cat = new Animal(12, "Tom", 123, "wild");
        System.out.println(cat.getInfo());
        Animal dog = new Animal(6, "Roko", 665533, "labrador");
        System.out.println(dog.getInfo());
        System.out.println(dog.name);
    }
}
