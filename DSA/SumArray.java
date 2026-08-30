public class SumArray{
    public static int sumArray(int[] arr , int index){
        if(index==5){
            return 0;
        }
        
        return arr[index] + sumArray(arr , index+1);
    }
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        int result = sumArray(arr , 0);
        System.out.println(result);
    }
}