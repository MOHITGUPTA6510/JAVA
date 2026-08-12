import java.util.Scanner;

public class ArrayBasic{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        int[] number = new int[5];
        
        for(int i=0 ; i<5; i++){
            System.out.print("Enter the value at index " + i + ": " );
            int a = Integer.parseInt(scn.nextLine());
            
            number[i] = a;
        }
        
        System.out.println("the array is : " + number[0]);
    }
}