package Arrays.med;
import java.util.*;
// 128. Longest Consecutive Sequence

public class LongestConsecutive {
    public static void main(String[] args) {
        int nums[]={100,4,200,1,3,2};
        int nums1[]={0,3,7,2,5,8,4,6,0,1};

        System.out.println(longestConsecutive(nums));
        System.out.println(longestConsecutive2(nums1));
    }
// BRUTE - FORCE
    static int longestConsecutive(int[] nums){
        Arrays.sort(nums);
        if(nums.length==0) return 0;
        int cnt=1,max=1;
        for(int i=1;i<nums.length;i++){

            if(nums[i]==nums[i-1]+1){
                cnt++;
            }else if(nums[i]!=nums[i-1]) cnt=1;
            max=Math.max(cnt,max);
        }

        return max;
    }

    static int longestConsecutive2(int nums[]){
        int cnt=0,max=0,curr=0;
        HashSet<Integer> set= new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int num:set){
            if (!set.contains(num-1)){
                curr=num;
                cnt=1;
            }
            while(set.contains(curr+1)){
                curr++;
                cnt++;
            }

            max=Math.max(cnt,max);
        }

        return max;
    }
}
