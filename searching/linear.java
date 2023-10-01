import java.util.Arrays;

public class linear {
    public static void main(String[] args) {
        int[] arr={1,10,3,900,34,35,-12,-111,10,-100};
        int[][] arr2={
            {1,2,3},
            {4,2,5,100,40},
            {90,22},
            {100,200}
        };
        int target=22;
        System.out.println(search(arr, target));
        System.out.println(max(arr));
        System.out.println(min(arr));
        System.out.println(search2d(arr2, target));
        System.out.println(even(arr));
        System.out.println(maxsalery(arr2));

        for (int[] is : arr2) {
            System.out.println(Arrays.toString(is));     
        }   
    }

    // sum all the element in each array of 2D array and return max  

    static int maxsalery(int[][] arr){
        int M[] = new int[arr.length];
        for (int i=0;i<arr.length;i++) {
            int sum=0;
            for (int j : arr[i]) {
                sum=sum+j;
            }
            M[i]=sum;

        }
       
        return min(M);
    }


    // Q find the count of number in array which contain even number of digits.
    static int even(int[] arr){
        int c=0;
        for (int i : arr) {
            if(check(i)){
                c++;
            }
        }
        return c;
    }
    
    static boolean check(int n){
        int c=0;
        if(n>0){
        while (n>0) {
            c++;
            n=n/10;
            
        }
    }
     else{
         while (n<0) {
         c++;
         n=n/10;
                
        }

        }
        if (c%2==0) {
            return true;
        }
        else
        return false;
    }

    // search in 2d array.
    static boolean search2d(int[][] arr2,int target){
        for (int[] is : arr2) {
            for (int i : is) {
                if (i==target) {
                    return true;
                }
            }
        }
        return false;

    }

    // search in array
    static boolean search(int arr[],int target){
        for (int i : arr) {
            if (i==target) {
                return true;
            }
        }
        return false;
    }
    // find max val 
    static int max(int[] arr){
        int M=Integer.MIN_VALUE;
        for (int i : arr) {
            if (i>M) {
                M=i;
            }
        }
        return M;
    }
    
    // find min val
    static int min(int[] arr){
        int M=Integer.MAX_VALUE;
        for (int i : arr) {
            if (i<M) {
                M=i;
            }
        }
        return M;
    }
}
