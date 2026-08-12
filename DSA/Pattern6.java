public class Pattern6{
    public static void main(String[] args){
        int n = 6;
        int z = 0 ;
        int x = 0;

        for(int i = 1; i <= n; i++){
             for(int j = 1 ; j <= i ; j++ ){
                z++;
                System.out.print(" "+z+" ");
            }
            System.out.println();
        }
    }
}