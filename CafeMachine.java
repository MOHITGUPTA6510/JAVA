// using abstraction
abstract class CoffeeMachine{
    
    public void  boilMethod(){
        System.out.println("Boiling water to 95'C ");
    }
    
    public abstract void brewCoffee();
}
class ExpressoMachine extends CoffeeMachine{
    
    @Override
    public void brewCoffee(){
        System.out.println("Passing through high pressure");
    }
    
}
class DripCoffeeMaker extends CoffeeMachine{
    
    @Override
    public void brewCoffee(){
        System.out.println("Slowly drip hot Coffee");
    }
}

public class CafeMachine{
    public static void main(String[] args){
        CoffeeMachine premiumMachine = new ExpressoMachine();
        premiumMachine.boilMethod();
        premiumMachine.brewCoffee();
    }
}