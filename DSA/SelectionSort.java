import java.util.*;

public class SelectionSort{
    public static void printArr(int arr[]){
        for (int i =0 ; i<arr.length ; i++){
            System.out.print(arr[i]+ " " );
        }
    }


    public static void main(String [] args){
        int[] arr = {7,8,1,2,3,43,6,83,3,452,32};

        for(int i = 0 ; i <arr.length ; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                     int temp = arr[i];
                     arr[i] = arr[j];
                     arr[j] = temp;
                }
            }
        }

        printArr(arr);
    }
}