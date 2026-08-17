import java.util.*;

public class InsertionSort{
    public static void printArr(int arr[]){
        for (int i =0 ; i<arr.length ; i++){
            System.out.print(arr[i]+ " " );
        }
    }


    public static void main(String [] args){
        int[] arr = {7,8,1,2,3,43,6,83,3,452,32};

        for(int i = 1 ; i <arr.length ; i++){
              int key = arr[i];
              int j = i-1;

              while(j >= 0 && key < arr[j]){
                arr[j+1] = arr[j];
                j--;
              }

              arr[j+1] = key;
        }

        printArr(arr);
    }
}