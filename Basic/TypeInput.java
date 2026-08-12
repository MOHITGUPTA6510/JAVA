import java.util.Scanner;

public class TypeInput{
    public static void main(String[] args){
        Scanner scn  = new Scanner(System.in);
        
        // reading single value
        System.out.print("Enter a sentence : ");
        String sentence = scn.nextLine();
        System.out.println("Entered sentence : " + sentence);
        
        // readind an Integer
        System.out.print("Enter an integer  :  ");
        int x  = Integer.parseInt(scn.nextLine());
        System.out.println("Entered integer is : " + x);
        
        // reading a float value
        System.out.print("Enter a float value : ");
        float y = Float.parseFloat(scn.nextLine());
        System.out.println("Entered Float Value : " + y);
        
        scn.close();
        
    }
}