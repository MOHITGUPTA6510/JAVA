import java.util.Scanner;

public class ForLoop{
    public static void main(String[] args){
        Scanner scn =  new Scanner(System.in);
        
        System.out.print("Enter the limit : ");
        int a = scn.nextInt();
        
        for (int i=0 ; i<=a ; i++){
            System.out.println("Count : "+i);
        }    
    }
}