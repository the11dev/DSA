import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={20,55,43,232,98,78};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
// wd every pass LHS sort hota jayega
    static void insertionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr, j,j-1);
                }else break;
            }
        }
    }

    static void swap(int[] arr , int n1, int n2){
        int temp=arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=temp;
    }
}

