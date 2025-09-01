package Arrays.easy;

public class SecLargest {
    public static void main(String[] args) {
        int[] nums={3, 13, 0, 99, -40};
        System.out.println(secLarge(nums));
        System.out.println(secSmall(nums));

    }

    static int secLarge(int[] nums){
        int max= Integer.MIN_VALUE;
        int secMax =Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                secMax=max;
                max=nums[i];
            }
        }
        return secMax;
    } 
    static int secSmall(int[] nums){
        int min= Integer.MAX_VALUE;
        int secMin =Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                secMin=min;
                min=nums[i];
            }
        }
        return secMin;
    } 
}
