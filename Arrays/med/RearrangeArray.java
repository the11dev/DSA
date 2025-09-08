package Arrays.med;
import java.util.*;
// 2149. Rearrange Array Elements by Sign
public class RearrangeArray {
    public static void main(String[] args) {
        int nums[]={3,1,-2,-5,2,-4};
        int nums2[]={-1,1};
        int ans1[]= rearrangeArray(nums);
        int[] ans2=rearrangeArray(nums2);

        System.out.println(Arrays.toString(ans1));
        System.out.println(Arrays.toString(ans2));

    }
    static int[] rearrangeArray(int[] nums){
        int n= nums.length;
        int pos[]=new int[n/2];
        int neg[]=new int[n/2];
        int i=0,j=0;
        for(int num:nums){
            if(num>0) pos[i++]=num;
            if(num<0) neg[j++]=num;
        }
    // ----WHILE LOOP----
        // int k=0,m=0;
        // while(m<(n/2)){
        //     nums[k++]=pos[m];
        //     nums[k++]=neg[m];
        //     m++;
        // }

    // ----FOR LOOP----
        int k=0;
        for(int m=0;m<n/2;m++){
            nums[k++]=pos[m];
            nums[k++]=neg[m];
        }
        return nums;
    }
}
