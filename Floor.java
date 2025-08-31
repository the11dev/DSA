public class Floor {
    public static void main(String[] args) {
        int[] arr= {10,20,30,50,60,80,90};
        int target1= 70;
        int target2= 30;
        System.out.println(floor(arr,target1));
        System.out.println(floor(arr,target2));
    }

// floor = greatest number in array that is smaller than the target
    static int floor(int[] arr, int target){
        int start=0;
        int end= arr.length-1;
        int ans=-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if (arr[mid]==target) return arr[mid];
            else if(arr[mid]<target) {
                ans=arr[mid];
                start=mid+1;
            }
            else end=mid-1;
        }
        
        return ans;
    }
}
