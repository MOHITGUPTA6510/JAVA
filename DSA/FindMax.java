public class FindMax{
    public static int findMax(int[] arr , int index){
        if(index == arr.length -1){
            return arr[index];
        }
        
        return Math.max(
            arr[index],
            findMax(arr , index+1)
        );
    }
    public static void main(String[] args){
        int[] arr = {10,20,300,40,50};
        int result = findMax(arr , 0);
        System.out.println(result);
    }
}