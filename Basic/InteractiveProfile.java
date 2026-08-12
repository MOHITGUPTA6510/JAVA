import java.util.Scanner;

public class InteractiveProfile{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        System.out.println("=== WELCOME TO JAVA PROFILE GENRATOR === /N ");    
        
        System.out.print("1. Enter your full name : ");
        String name = scn.nextLine();
        
        System.out.print("2. Enetr ypur age : ");
        int age = Integer.parseInt(scn.nextLine());
        
        System.out.println("3. Enter your current SGPA : ");
        double sgpa = Double.parseDouble(scn.nextLine());
        
        System.out.print("4. are you registered for thr next semster ? (true/false) : ");
        boolean regis = Boolean.parseBoolean(scn.nextLine());
        
        System.out.println("\n-------------------------------------------");
        System.out.println("📦 PROFILE CREATED SUCCESSFULLY!");
        System.out.println("-------------------------------------------");
        System.out.println("User Name : " + name);
        System.out.println("Age : " + age + "year old");
        System.out.println("SGPA : " + sgpa);
        System.out.println("registered : " + (regis ? "yes" : "no"));
        System.out.println("-------------------------------------------");
    }
}