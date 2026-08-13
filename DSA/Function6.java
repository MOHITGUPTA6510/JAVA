import java.util.*;

public class Function6{
    public static int fibonacciSeries(int a){
        int b =0;
        int c =1;
        for(int i = 2; i <= a ; i++ ){
            int d = b+c;
            b = c;
            c = d;  
            System.out.println(d);
        }
        return 0;
    }
    
    public static void main(String[] args){
        fibonacciSeries(24);
    }
}