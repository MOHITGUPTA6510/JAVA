class Vehicle{
    String brand;
    int speed;
    
    public void move(){
        System.out.println(brand+" is moving at "+speed+ "km/h");
    }
}
class Car extends Vehicle{
    int numberOfDoors;
    public void honk(){
        System.out.println(brand+" car say : Beep Beep!");
    }
}
public class TheVehicleSystem{
    public static void main(String[] args){
        Car firstCar = new Car();
        firstCar.brand = "BMW";
        firstCar.speed = 240;
        firstCar.numberOfDoors = 4;
        
        firstCar.move();
        firstCar.honk();
    } 
}