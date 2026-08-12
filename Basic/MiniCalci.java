import java.util.Scanner ;

public class MiniCalci{
    public static int add(int a , int b){
        int c = a+b;
        return c;
    } 
    
    public static int sub(int a , int b){
        int c = a-b;
        return c;
    }
    
    public static int mul(int a , int b){
        int c = a*b;
        return c;
    }
    
    public static float div (int a , int b){
        float c = (float) a/b;
        return c;
    }
    
    public static void main(String[] args){
        boolean KeepGoing = true;
    
        while(KeepGoing){
            Scanner scn = new Scanner(System.in);
        
            System.out.println("Welcome to th calci .");
        
            System.out.print("Enter the first number : ");
            int a = Integer.parseInt(scn.nextLine());
        
            System.out.print("Enetr the second number : ");
            int b = Integer.parseInt(scn.nextLine());
        
            System.out.print("Enetr the operation (add,sub,mul,div or quit) : ");
            String operation = scn.nextLine();
        
            if (operation.equals("add")){
                int result = add(a,b);
                System.out.println("The result is : " +result);
            }
            else if (operation.equals("sub")){
                int result = sub(a,b);
                System.out.println("The result is : " +result);
            }
            else if (operation.equals("mul")){
                int result = mul(a,b);
                System.out.println("The result is : " +result);
            }
            else if (operation.equals("div")){
                float result = div(a,b);
                System.out.println("The result is : " +result);
            }
            else if (operation.equals("quit")){
                System.out.println("Thank You !!");
                KeepGoing = false;
            }
            else {
                System.out.println("Enter valid operation..");
            }
        }
    }
    
    
}