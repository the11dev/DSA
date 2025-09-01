package Arrays.easy;
import java.util.*;
// LEETCODE 189
public class RotateArray {
    public static void main(String[] args) {
        int[] nums1= {1,2,3,4,5,6,7};
        // [5,6,7,1,2,3,4]
        int k1=3;
        int[] nums2= {-1,-100,3,99};
        // [3,99,-1,-100]
        int k2=2;
        rotate(nums1,k1);
        rotate(nums2,k2);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

    }
    static void rotate(int[] nums, int k) {
        int n= nums.length;
        k=k%n;
        // puri array reverse =>[7,6,5,4,3,2,1]
        reverse(nums,0,n-1);
        // starting k 'k' elements ko reverse kr rhe => [5,6,7,4,3,2,1]
        reverse(nums,0,k-1);
        // baaki k bche huye elements ko reverse krdo =>[5,6,7,1,2,3,4]
        reverse(nums,k,n-1);
    }

    static void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
