import java.util.Arrays;
public class BinarySearch2D {
    public static void main(String[] args) {
        int arr[][]={
            {1,2,6},
            {3,5,8},
            {4,7,9}};
        int target= 55;
        int[] ans=binarySearch2D(arr,target);
        System.out.println(Arrays.toString(ans));
    }
// Sorted row and col wise
    static int[] binarySearch2D(int[][]arr, int target){
        int row=0;
        int col= arr[0].length-1;
        int n=arr.length;
        while(row<n && col>0){
            if(arr[row][col]==target){
                return new int[] {row,col};
            }else if(arr[row][col]>target) col--;
            else row++;
        }
        return new int[] {-1,-1};
    }
}
