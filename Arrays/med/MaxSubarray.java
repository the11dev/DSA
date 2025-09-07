package Arrays.med;
// import java.util.*;
public class MaxSubarray {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        int[] nums2={5,4,-1,7,8};

        int ans=kadaneAlgo(nums);
        int ans2=kadaneAlgo(nums2);

        
        System.out.println(ans);
        System.out.println(ans2);
    }

    // KANDANE ALGO
    static int kadaneAlgo(int[] nums){
        int max=nums[0];
        int csum=nums[0];
        for(int i=1;i<nums.length;i++){
            csum=Math.max(nums[i],csum+nums[i]);
            max=Math.max(max,csum);
        }
        return max;
    }
}
