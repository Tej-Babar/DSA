import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr={2,6,3,9,3,5,8,5,10,0,-1};
        int[] arr1={0};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
     // start i from index 0 upto index-1
    // start j from i+1 and decriment to >0
    // at the position of i arr is sorted 
    // j is at the next of i and comapre it to the previous part of the array.
    static void insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j]<arr[j-1]) {
                    swap(arr, j, j-1);
                }
                else
                break;
                
            }
            
        }

    }
   
    static void selection(int[] arr){
        
        for (int i = 0; i < arr.length; i++) {
           
            int end=arr.length-1-i;
            int maxindex=max(arr, 0, end);
            swap(arr, maxindex, end);
        }
       
    }

    static int max(int[] arr, int s,int e){
        int m=s;
        for (int i = s; i <=e; i++) {
            if (arr[m]<arr[i]) {
                m=i;
            }
            
        }
        return m;
    }
    static void swap(int[] arr,int s,int e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
}
