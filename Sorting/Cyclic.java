import java.util.Arrays;

public class Cyclic {
    public static void main(String[] args) {
        int[] arr={1,3,2,4,5,7,8,6,11,10,9};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicsort(int[] arr){
        for (int i = 0; i <arr.length; i++) {
            int correct=arr[i]-1;
            if (arr[i]!=arr[correct]) {
               swap(arr, i, correct); 
            }
        }

    }

    static void cyclic(int[] arr){
        int i=0;
        while (i<arr.length) {
            int correctindex=arr[i]-1;
            if (arr[i]!=arr[correctindex]) {
                swap(arr, i, correctindex);
            }
            else{
                i++;
            }
            
        }
    }
    static void swap(int arr[],int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}


