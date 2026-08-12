public class Pattern10{
    public static void main(String[] args){
        int n = 12;
        int z = 0;

        for(int i = 1; i <= n; i++){
            z++;
            for(int j = 1 ; j <= n-i ; j++ ){
                System.out.print("   ");    
            }
            for(int j = 1 ; j <= i ; j++ ){
                System.out.print(" "+z+" ");
                System.out.print("   ");

            }
            System.out.println();
        }
    }
}