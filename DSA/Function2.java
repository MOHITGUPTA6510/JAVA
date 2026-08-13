import java.util.*;

public class Function2{
    public  static int avarageThreeNumber(int a , int  b , int c){
        int avarage = (a+b+c)/3;
        System.out.println("Avarage : "+avarage );
        return 0;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        avarageThreeNumber(a,b,c);

    }
}