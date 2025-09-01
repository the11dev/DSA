import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={20,55,43,232,98,78};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // aage wale se compare krke sort krte jaoo jb tk puri array sort na ho jaaye
    static void bubbleSort(int[]arr){
        for(int i=0;i<arr.length;i++){
            boolean swapped= false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if (swapped=false) 
            break;
        }
    }
}
