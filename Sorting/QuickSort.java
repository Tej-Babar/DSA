import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
       int[] height={1,8,6,-9,0,6,72,5,4,8,3,7};
       quick(height, 0, height.length-1);
       System.out.println(Arrays.toString(height));
       
    }

    static void quick(int[] arr,int low,int high){

    
        if (low>=high) {
            return;
        }

        int s=low;
        int e=high;
        int m=s+(e-s)/2;
        int pivot=arr[m];
        
        while (s<=e) {
            
            while (arr[s]<pivot) {
                s++;
            }

            while (arr[e]>pivot) {
                e--;
            }

            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;


            }
        }

        quick(arr, low,e);
        quick(arr, s, high);
    }


}
