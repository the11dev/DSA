public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={20,55,43,232,98,78};
        int target=232;
        int ans=linearSearch(arr,target);
        System.out.println("Target at index: "+ans);
    }
    static int linearSearch(int[] arr, int target){
        if (arr.length==0) return -1;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    
}
