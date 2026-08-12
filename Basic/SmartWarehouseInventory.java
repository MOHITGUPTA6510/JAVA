import java.util.ArrayList;
class Product{
    String name;
    double price;
    
    public Product(String name , double price){
        this.name = name;
        this.price = price;
    }
    
    void displayInfo(){
        System.out.println(name+" - $"+price);
    }
}
public class SmartWarehouseInventory{
    public static void main(String[] args){
        ArrayList<Product> inventory = new ArrayList<>();
        
        inventory.add(new Product("Laptop" ,999.99));
        inventory.add(new Product("Smartphone" ,499.99));
        inventory.add(new Product("Headphone" ,89.99));
        
        System.out.println("the size is :"+inventory.size());
        
        inventory.remove(0);
        System.out.println("the new size :"+inventory.size());
        
        for(Product pro : inventory){
            pro.displayInfo();
        }
    }
}




















