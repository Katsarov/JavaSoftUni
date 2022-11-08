package ExamplesObjectAndClassesLab;

public class Example_04 {
    static class Circle{
        private double radius;
        private double area;

        Circle(double radius){
            this.radius = radius;
            this.area = Math.PI * radius * radius;
        }

        void setRadius(double radius){
            this.radius = radius;
            this.area = Math.PI * radius * radius;
        }

        double getRadius(){
            return this.radius;
        }

        String getInfo(){
            return "Circle (R = " + this.radius + ", A = " + this.area + ")";
        }
    }

    public static void main(String[] args) {
        Circle a = new Circle(5);
        System.out.println(a.getInfo());
        a.setRadius(15);
        System.out.println(a.getInfo());
    }
}
