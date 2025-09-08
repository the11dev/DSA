package Arrays.med;
// 121. Best Time to Buy and Sell Stock

public class MaxProfit {
    public static void main(String[] args) {
        int[] nums={7,1,5,3,6,4};
        int[] nums2={7,6,4,3,1};

        int ans=maxProfit(nums);
        int ans2=maxProfit2(nums2);

        
        System.out.println(ans);
        System.out.println(ans2);
    }

// BRUTE FORCE 
    static int maxProfit(int[] nums){
        int n=nums.length;
        int pro=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int diff=nums[j]-nums[i];
                if(diff>pro){
                    pro=diff;
                }
            }
        }
        return pro;
    }

    static int maxProfit2(int nums[]){
        int n=nums.length;
        int buy=nums[0];
        int profit=0;
        for(int i=0;i<n;i++){
            if(nums[i]<buy){
                buy=nums[i];
            }else if (nums[i]-buy>profit){
                profit=nums[i]-buy;
            }
        }
        return profit;
    }
}
