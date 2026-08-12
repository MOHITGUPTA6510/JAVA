public class Pattern7{
    public static void main(String[] args){
        int n = 6;
        int z = 1 ;
        int x = 0;

        for(int i = 1; i <= n; i++){
             for(int j = 1 ; j <= i ; j++ ){
                if((i+j)%2==0){
                    System.out.print(" "+z+" ");
                } else{
                    System.out.print(" "+x+" ");
                }
            }
            System.out.println();
        }
    }
}