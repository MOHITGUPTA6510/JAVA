import java.util.Scanner;

public class MiniVote{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        boolean keeprunning = true ;
        
        while(keeprunning){
            System.out.print("Enter your age or (0 for exit) : ");
            int age = Integer.parseInt(scn.nextLine());
            
            if (age == 0){
                keeprunning = false;
                System.out.println("Thany You !! Have a great day ");
            }
            else if (age < 0){
                System.out.println("Invalid age . Age cannot be negative ");
            }
            else if (age < 18){
                System.out.println("You are not elegible for vote");
                System.out.println("Come back after " + (18-age) + " years.");
            }
            else{
                System.out.println("You are able to give vote .");
                System.out.println("Welcome !!");
            }
        }
    }
}