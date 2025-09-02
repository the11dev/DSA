package Arrays.easy;
import java.util.*;
public class MissingNumber {
    public static void main(String[] args) {
        int[] nums={0,1};
        int ans= missingNumber(nums);
        System.out.println(ans);
    }
    static int missingNumber(int[] nums){
        int n=nums.length;
        int eSum=n*(n+1)/2;
        int aSum=0;
        for(int num:nums){
            aSum+=num;
        }
        return eSum-aSum;
    }
}
