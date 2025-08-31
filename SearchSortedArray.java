import java.util.*;
public class SearchSortedArray {
    public static void main(String[] args) {
        int arr[][]={
            {1, 2, 3, 4 },
            {5, 6, 7, 8 },
            {9, 10,11,12}};
        int target= 7;
        int[] ans=searchSortedArray(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchSortedArray(int[][] arr, int target){
        int row=arr.length;
        int col=arr[0].length;

        if(row==1) return binarySearch(arr[0],target,0);
        int rStart=0;
        int rEnd=row-1;
        int cMid=col/2;
        // search space
        while(rStart<rEnd-1){
            int rMid=rStart+(rEnd-rStart)/2;
            if(arr[rMid][cMid]==target) return new int[]{rMid,cMid};
            else if (arr[rMid][cMid]>target) rEnd=rMid;
            else rStart=rMid;
        }
        // mid m hi check kr rhe h
        if(arr[rStart][cMid]==target) return new int[] {rStart,cMid};
        if(arr[rStart+1][cMid]==target) return new int[] {rStart+1,cMid};

        // jo parts bche vaha check krna h na
        if(cMid-1>=0 && arr[rStart][cMid-1]>=target){
            return binarySearch(arr[rStart],target,0);
        }
        if(cMid+1<col && arr[rStart][cMid+1]<=target && target<=arr[rStart][col-1]){
            return binarySearch(arr[rStart],target,cMid+1);
        }
        if(cMid-1>=0 && arr[rStart+1][cMid-1]>=target){
            return binarySearch(arr[rStart+1],target,0);
        }
        if(cMid+1<col && arr[rStart+1][cMid+1]<=target){
            return binarySearch(arr[rStart+1],target,cMid+1);
        }
        return new int[]{-1,-1};
    }

    static int[] binarySearch(int[] arr, int target, int cStart){
        int start=cStart;
        int end=arr.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(arr[mid]==target) return new int[]{0,mid};
            else if(arr[mid]>target) end=mid-1;
            else start=mid+1;
        }
        return new int[]{-1,-1};
    }
}
