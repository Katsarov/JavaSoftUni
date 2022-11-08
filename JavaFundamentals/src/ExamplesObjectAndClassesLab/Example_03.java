package ExamplesObjectAndClassesLab;

public class Example_03 {
    static class Vehicle{
        String model;
        int prodYear;
        int maxSpeed;
        int price;

        Vehicle(String model, int prodYear, int maxSpeed, int price){
            this.model = model;
            this.prodYear = prodYear;
            this.maxSpeed = maxSpeed;
            this.price = price;
        }

        String getInfo(){
            return "Model: " + this.model + " ||| " + "Produced year: " + this.prodYear + " ||| " + "Max Speed: " + this.maxSpeed + " km/h" + " ||| " + "Price " + this.price
 + " USD.";
        }
    }


    public static void main(String[] args) {
        Vehicle truck = new Vehicle("Transporter", 2003, 180, 86000);
        Vehicle car = new Vehicle("Altea", 2011, 222, 35000);
        Vehicle car2 = new Vehicle("Meriva", 2017, 200, 45000);

        System.out.println(truck.getInfo());
        System.out.println(car.getInfo());
        System.out.println(car2.getInfo());
    }
}
