package Arrays.easy;
import java.util.*;

public class MoveZeros {
    public static void main(String[] args) {
        int[] num1 = {0,22,0,3,12};
        int[] num2 ={2,1,0};
        moveZeros(num1);
        moveZeroes(num2);
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));
    }

    // Method1
    static void moveZeros(int[] arr){
        int cnt0=0;
        int j=0;
        for(int i=0;i<arr.length;i++){    
                if (arr[i]==0){
                    cnt0++;
                }else{
                arr[j]=arr[i];
                j++;
            }
        }
        while(cnt0-->0){
                arr[j++]=0;
            }
        }
    

    // Method2
    static void moveZeroes(int[] arr){
        int idx=0;
        for(int a:arr){
            if(a!=0){
                arr[idx++]=a;
            }
        }
        while(idx<arr.length){
            arr[idx++]=0;
        }
    }
}
