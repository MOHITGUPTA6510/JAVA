import java.util.*;

public class Function5{
    public static int GCD(int a , int b){
        for(int i = 0; i <= a ; i++ ){
            if (a%b == 0){
                System.out.println(b);
                break;
            }else{
                int c  = a%b;
                a=b;
                b=c;
            }
        }
        return 0;
    }
    
    public static void main(String[] args){
        GCD(18,12);
    }
}