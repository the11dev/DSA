import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={2,5,12,16,23,38,56,72,91,96};
        int target=23;
        int ans=binarySearch(arr,target);
        System.out.println("Target at index: "+ans);
    }
    static int binarySearch(int[] arr, int target){
        Arrays.sort(arr);
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target) return mid;
            if(arr[mid]>target)
                end=mid-1;
            else
                start=mid+1;
        }
        return -1;

    }
}
