package Arrays.easy;
// LEETCODE 1752
// check if array is sorted and rotated
public class CheckSortedArray {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        int[] nums2={2,1,3,4};
        System.out.println(check(nums));
        System.out.println(check(nums2));
    }

    static boolean check(int[] arr){
        // break's count 
        int count=0;
        for(int i=0;i<arr.length;i++){
        // B[i]= A[(i+x)%SIZE] => maths for rotation 
            if(arr[i]>arr[(i+1)%arr.length]) 
            count++;
        }
        // check if there is more than 1 break, its either not sorted or rotated 
        return count<=1;
    }
}
