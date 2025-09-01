import java.util.*;
public class SelectionSortMax {
    public static void main(String[] args) {
        int[] arr={20,55,43,232,98,78};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
// find max nd put it in its right position
    static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int lastIdx=arr.length-i-1;
            int max=max(arr,0,lastIdx);
            swap(arr,max,lastIdx);
        }
    }

    static void swap(int[] arr, int n1, int n2){
        int temp=arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=temp;
    }

    static int max(int[] arr, int start, int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
}
