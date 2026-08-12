class MenuItem{
    String name;
    double price;
    
    public MenuItem(String name ,  double price){
        this.name = name;
        this.price = price;
    }
    
    public void printReceiptLine(){
        System.out.println(name+" costs $"+price);
    }
}
class Drink extends MenuItem{
    String size ;
    
    public Drink(String name , double price , String size){
        super(name,price);
        this.size = size;
    }
    
    public void serveCold(){
        System.out.println("Serving a cold "+size+" "+name);
    }
}

class Food extends MenuItem{
    boolean isVegetarian;
    
    public Food(String name, double price , boolean isVegetarian){
        super(name,price);
        this.isVegetarian = isVegetarian;
    }
    
    public void checkDietary(){
        if(isVegetarian == true ){
            System.out.println(name+" is vegetarian");
        }
        else{
            System.out.println(name+" contains meat");
        }
    }
}

public class TheFoodMenu{
    public static void main(String[] args){
        Drink firstDrink = new Drink("Banana Milk Shake",240.00,"Medium");
        
        
        firstDrink.serveCold();
        firstDrink.printReceiptLine();
        
        Food firstFood = new Food("Biryani",650.00, false);
        
        firstFood.checkDietary();
        firstFood.printReceiptLine();
    }
}