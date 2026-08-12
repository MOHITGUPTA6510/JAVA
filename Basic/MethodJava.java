import java.util.Scanner;

public class MethodJava{
    Scanner scn = new Scanner(System.in);
    
    public static void welcomePlayer(String PlayerName){
        System.out.println("welcome : "+PlayerName);
    }
    
    public static int takeDamage(int playerHealth , int damageTaken){
        int remainHealth = playerHealth - damageTaken;
        return remainHealth;
    }
    
    public static void main(String[] args){
        welcomePlayer("mohit");
        
        
        int finalHealth = takeDamage(100 , 30);
        
        System.out.println("your health is : "+ finalHealth);
    }
}