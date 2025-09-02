package Arrays.easy;
import java.util.*;
public class SingleNumber {
    public static void main(String[] args) {
        int nums[]= {4,1,2,1,2};
        int ans= singleNumber(nums);
        System.out.println(ans);
    }
     static int singleNumber(int[] nums){
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i+=2){
            if(nums[i]!=nums[i-1]){
                return nums[i];
            }
        }
        return nums[nums.length-1];

     }
}
