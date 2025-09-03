package Arrays.med;
import java.util.*;
public class MajorityElement {
        public static void main(String[] args) {
            int[] nums= {2,2,1,1,1,2,2};
            int ans= majorityElement(nums);
            System.out.println(ans);

            int[] nums1= {3,2,3};
            int ans1= majorityElement1(nums1);
            System.out.println(ans1);

            int[] nums2= {2,4,2,1,4,4,4,1,2,2,3,3,4,4,4,4};
            int ans2= majorityElement2(nums2);
            System.out.println(ans2);
        }
// SORTING ALGO
        static int majorityElement(int nums[]){
            int n=nums.length;
            Arrays.sort(nums);
            return nums[n/2];
        }

// HASHMAP ALGO
        static int majorityElement1(int nums[]){
                HashMap<Integer,Integer> map= new HashMap<>();
                for(int num:nums){
                    map.put(num, map.getOrDefault(num, 0) + 1);
                    int n=nums.length/2;
                    if(map.get(num)>n){
                        return num;
                    }
                }
                return -1;
            }

// MOORE VOTING ALGO
        static int majorityElement2(int[]nums){
            int cnt=0,candidate=0;
            int n=nums.length;
            for(int num:nums){
                if (cnt==0){
                    candidate=num;
                }
                if(candidate==num){
                    cnt++;
                }else{
                    cnt--;
                }
        }
        int c=0;
        for(int num:nums){
            if(num==candidate){
                c++;
            }
        }
        if(c>n/2) return candidate;

        return -1;
    }
}
