package Arrays.med;
import java.util.*;
public class SortColors {
    public static void main(String[] args) {
        int[] nums= {2,0,2,1,1,0};
        int n=nums.length-1;
        sortColors(nums,n);
        System.out.println(Arrays.toString(nums));
    }

    static void sortColors(int[] nums,int n){
        int zero=0,one=0,two=0,i=0;
        for(int num:nums){
            if(num==0) zero++;
            else if(num==1) one++;
            else two++;
        }
        while(zero-->0) nums[i++]=0;
        while(one-->0) nums[i++]=1;
        while(two-->0) nums[i++]=2;
    }
}
