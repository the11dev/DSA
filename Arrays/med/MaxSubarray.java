package Arrays.med;
// import java.util.*;
public class MaxSubarray {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        int[] nums2={5,4,-1,7,8};

        int ans= maxSubarray(nums);
        // int ans2=kadaneAlgo(nums);
        
        System.out.println(ans);
        // System.out.println(ans2);
    }

    // BRUTE FORCE
    static int maxSubarray(int[]  nums){
        int i=0;
        int sum=nums[0];
        int psum=sum;
        int max=Integer.MIN_VALUE;
        for(int j=1;j<nums.length;j++){
            sum+=nums[j];
            if(psum>sum){
                sum-=nums[i];
                i++;
            }
            max=Math.max(sum,max);
        }
        return max;
    }

    // static int kadaneAlgo(int[] nums){

    // }
}
