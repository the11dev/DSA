package Arrays.easy;
import java.util.*;
// LEETCODE 26
public class RemoveDuplicates {
    public static void main(String[] args) {
            int[] nums1= {0,0,1,1,1,2,2,3,3,4};
            int[] nums2= {1,1,2};
            int c1=removeDup(nums1);
            int c2=removeDup(nums2);
            System.out.println(c1+" "+Arrays.toString(nums1));
            System.out.println(c2+" "+Arrays.toString(nums2));
    }

    static int removeDup(int[] nums){
        int i=0;
        for(int j=1;j<nums.length;j++){
        
        //unique elem hai toh i++ 
            if(nums[i]!=nums[j]) i++;
        // vrna overwrite dupli
            nums[i]=nums[j];
        }
        return i+1;
    }
}
