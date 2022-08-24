import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={2,6,3,9,3,5,8,5,10};
        int[] arr1={1,2,3,4,5,6,7,9,8,10};
        Bubble(arr1);
        
    }
    static void Bubble(int [] arr){
        boolean c;
        for (int i = 0; i < arr.length-1; i++) {
            c=true;
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    c=false;
                }
            }
            System.out.println("Array after "+(i+1)+ " pass :");
            System.out.println(Arrays.toString(arr));
            if (c) {
                return ;
            }
 
        }
        return ;
    }
    
}
