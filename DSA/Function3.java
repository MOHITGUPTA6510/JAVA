import java.util.*;

public class Function3{
    public  static int avarageThreeNumber(int a){
        int sum = 0;

        for (int i = 1; i <=a ; i++ ){
            if(i%2 != 0){
                sum = sum+i;
            }
        }
        System.out.println("sum : "+sum );
        return 0;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        avarageThreeNumber(a);

    }
}