import java.util.ArrayList;

public class DynamicFoodMenu{
    public static void main(String[] args){
        ArrayList<String> menu = new ArrayList<>();
        
        menu.add("Pasta");
        menu.add("Pizza");
        menu.add("Burger");
        menu.add("Fries");
        
        System.out.println("the size of array : "+menu.size());
        
        menu.remove(1);
        
        System.out.println("2nd Element : "+menu.get(1));
        
        for (String arr : menu ){
            System.out.println(arr);
        }
    }
}