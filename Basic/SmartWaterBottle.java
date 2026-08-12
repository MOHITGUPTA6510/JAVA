class WaterBottle {
    private int capacity;       
    private int currentAmount;

    
    public WaterBottle(int capacity) {
        this.capacity = capacity;
        this.currentAmount = 0;
    }
    
    public void addWater(int amount) {
        
        this.currentAmount += amount; 
        
        if (this.currentAmount >= this.capacity) {
            System.out.println("The Bottle is full! Overflowed " + (this.currentAmount - this.capacity) + " ml.");
            this.currentAmount = this.capacity;
        } else {
            System.out.println(this.currentAmount + " ml is currently in the Bottle.");
        }
    }

    public void drinkWater(int amount) {
        
        this.currentAmount -= amount; 
        
        if (this.currentAmount <= 0) {
            System.out.println("Bottle is now empty!");
            this.currentAmount = 0;
        } else {
            System.out.println(this.currentAmount + " ml is left in the Bottle.");
        }
    }

    
    public double getOunces() {
        double ounces = (double) this.currentAmount * 0.034;
        return ounces;
    }
}


public class SmartWaterBottle {
    public static void main(String[] args) {
        System.out.println("--- Testing a 500ml Bottle ---");
        WaterBottle gymBottle = new WaterBottle(500);
        
        gymBottle.addWater(300); // 300 ml is currently in the Bottle.
        gymBottle.addWater(300); // The Bottle is full! Overflowed 100 ml.
        
        System.out.println("Fluid Ounces: " + gymBottle.getOunces()); // 500 * 0.034 = 17.0
        
        gymBottle.drinkWater(600); // Bottle is now empty!
    }
}