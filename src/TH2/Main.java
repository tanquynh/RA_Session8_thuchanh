package TH2;

import TH2.Car;
import TH2.Motorcycle;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "black");
        Car car2 = new Car("Ford", "white");
        System.out.println("Car1 's brand is " + car1.getBrand());
        car1.setColor("yellow");
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        Motorcycle motor1 = new Motorcycle("Honda", "red-while");
        Motorcycle motor2 = new Motorcycle("Vinfast", "blue");
        System.out.println(motor1.toString());
        System.out.println(motor2.toString());
    }

}
