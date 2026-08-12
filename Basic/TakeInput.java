import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter your age: ");
        // Grabs the whole line (25 + Enter) and converts it to a number
        int age = Integer.parseInt(scn.nextLine()); 

        System.out.print("Enter your name: ");
        // The belt is clean, so it waits for you to type perfectly!
        String name = scn.nextLine(); 

        System.out.println("\n--- RESULTS ---");
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        
        scn.close();
    }
}