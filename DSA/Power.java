public class Power{
    public static int power(int base , int exponent){
        if (exponent==0){
            return 1;
        }
        return base * power(base,exponent-1);
        
    }
    public static void main(String[] args){
        int result = power(10,3);
        System.out.print(result);
    }
}