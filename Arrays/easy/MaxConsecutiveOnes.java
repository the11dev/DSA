package Arrays.easy;
import java.util.*;
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int nums[] ={1,0,1,1,0,1};
        int ans=findMaxConsecutiveOnes(nums);
        System.out.println(ans);
    }

    static int findMaxConsecutiveOnes(int[] nums){
        int cnt=0;
        int max=Integer.MIN_VALUE;
        for(int num:nums){
            if(num==1){
                cnt++;
                max=Math.max(cnt,max);
            }else cnt=0;
        }
        return max;
    }
}
