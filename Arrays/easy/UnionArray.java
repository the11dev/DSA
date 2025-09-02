package Arrays.easy;
import java.util.*;
public class UnionArray {
    public static void main(String[] args) {
        int[] nums1={1, 2, 3, 4, 5};
        int[] nums2= {1, 2, 7};
        int[] ans=unionArray(nums1,nums2);
        System.out.println(Arrays.toString(ans));
    }

    // nums1 = [1, 2, 3, 4, 5], nums2 = [1, 2, 7]
    static int[] unionArray(int[] num1, int[] num2){
        int k=0;
        // int[] ans= new int[m+n];
        HashSet<Integer> set= new HashSet<>();
        for(int num:num1){
            set.add(num);
        }
        for(int num:num2){
            set.add(num);
        }
        int[] ans= new int[set.size()];
        for(int a:set){
            ans[k++]=a;
        }
        return ans;
    }
}
