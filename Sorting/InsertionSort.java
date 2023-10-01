
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={2, 4, 1, 3, 5};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr){
        int c=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j>0; j--) {
                
                if (arr[j]<arr[j-1]) {
                    c++;
                    swap(arr,j,j-1);
                    
                }
                else {
                    break;
                }
                
            }
            
        }
        System.out.println(c);

        
    }

    static void swap(int[] arr,int f,int s){
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }
}
