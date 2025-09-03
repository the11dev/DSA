package Arrays.easy;

public class LongestSubarray {
    public static void main(String[] args) {
        int[] nums ={10, 5, 2, 7, 1, 9};
    int k=15;
    int ans= longestSubarray(nums,k);
    System.out.println(ans);
    }

    static int longestSubarray(int[] nums, int k){
        int left=0, max=0,sum=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>k){
                sum-=nums[left];
                left++;
            }
            if (sum==k) max=Math.max(max,right-left+1);
        }
        return max;
    }
}
