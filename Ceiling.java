public class Ceiling {
    public static void main(String[] args) {
        int[] arr= {10,30,50,60,80,90};
        int target1= 70;
        int target2= 30;
        System.out.println(ceiling(arr,target1));
        System.out.println(ceiling(arr,target2));
    }

//Ceiling = smallest element in array greater or equal to target

    static int ceiling(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        if(target> arr[arr.length-1]){
            return -1;
        }

        while(start<=end){
            int mid= start+(end-start)/2;
            if(arr[mid]==target) return arr[mid];
            else if(arr[mid]<target) start=mid+1;
            else end=mid-1;
        }
        return arr[start];
    }
}
