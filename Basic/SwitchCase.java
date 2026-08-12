import java.util.Scanner;

public class SwitchCase{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter the day number (1-7): ");
        int dayNumber = scn.nextInt();
        
        String dayName ;
        
        switch (dayNumber){
            case 1 : dayName = "Monday"; break ;
            case 2 : dayName = "Tuesday" ; break;
            case 3 : dayName = "Wednesday"; break;
            case 4 : dayName = "Thursday" ; break;
            case 5 : dayName = "Friday" ; break;
            case 6 : dayName = "Saturday"; break;
            case 7 : dayName = "Sunday" ; break;
            default : dayName = "Invalid day Input" ; break;
        }
        System.out.println("Today is "+ dayName);
        
    }
}