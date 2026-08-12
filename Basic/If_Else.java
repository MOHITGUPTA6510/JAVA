import java.util.Scanner;

public class If_Else{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter the score : ");
        int score = scn.nextInt();
        
        if  (score >= 90){
            System.out.println("Grade : A");
        } 
        else if (score >=80){
            System.out.println("Grade : B");
        }
        else {
            System.out.println("Grade : C");
        }
    }
}