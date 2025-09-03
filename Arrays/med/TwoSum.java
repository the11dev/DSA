package Arrays.med;
import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int k=9;
        int[] nums1={3,2,4};
        int k1=6;
        int[] ans= twoSum(nums,k);
        int[] ans1= twoSum1(nums1,k1);

        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(ans1));
    }
// BRUTE FORCE - TWO POINTER
    static int[] twoSum(int[] nums, int k){
        int[] ans= new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length-1;j++){
                if(nums[i]+nums[j]==k){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;
    }

    static int[] twoSum1(int[] nums, int k){
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff=k-nums[i];
            if(map.containsKey(diff)){
                return new int[] {i,map.get(diff)};
            }
            map.put(nums[i],i);
        }
        return new int[] {-1,-1};

    }
}
