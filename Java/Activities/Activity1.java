package activities;

public class Activity1 {

    public static void main(String[] args) {
        Car carObj1 = new Car();
        carObj1.make = 2020;
        carObj1.color = "Red";
        carObj1.transmission = "Manual";
     
        carObj1.displayCharacterstics();
        carObj1.accelerate();
        carObj1.brake();
    }

}