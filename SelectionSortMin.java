import java.util.*;
public class SelectionSortMin {
    public static void main(String[] args) {
        int[] arr={20,55,43,232,98,78};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
// find min nd usko sahi idx pr lagate jao
    static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int start= i;
            int min=min(arr, start, arr.length-1);
            swap(arr, min, start);
        }
    }

    static void swap(int[] arr,int n1,int n2){
        int temp=arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=temp;
    }
    static int min(int[] nums, int start , int end){
        int min=start;
        for(int i=start;i<=end;i++){
            if(nums[i]<nums[min]){
                min=i;
            }
        }
        return min;
    }
}

