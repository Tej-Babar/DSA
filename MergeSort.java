import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={4,-1,4,4,4,452,7,5,8,9,0,1,23};
        merge1(arr,0,arr.length);
        
        System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(ans));
        
    }

    // Creating copy of original array and sending to future call
    // we are not changing the origional array 
    
    static int[] merge(int[] arr){
        if (arr.length==1) {
            return arr;
        }

        int mid=arr.length/2;

        int [] left=merge(Arrays.copyOfRange(arr, 0,mid));
        int [] right=merge(Arrays.copyOfRange(arr,mid,arr.length));

        return mix(left,right);
    }

    static int[] mix(int[] left,int[] right){
        int[] ans = new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<left.length && j<right.length) {
            if (left[i]<right[j]) {
               ans[k]=left[i]; 
               i++;
            }
            else {
                ans[k]=right[j];
                j++;
            }
            k++;
        }

        while (i<left.length) {
            ans[k]=left[i]; 
               i++;
               k++;
        }
        while (j<right.length) {
            ans[k]=right[j]; 
               j++;
               k++;
        }

        return ans;
    }


    // Not creating copy of array 
    // passing the index of array which we want to merge
    static void merge1(int[] arr,int s,int e){
     
        if (e-s==1) {
            return ;
        }

         int m=(s+e)/2;

         merge1(arr, s, m);
         merge1(arr,m, e);

         mix1(arr, s, m, e);


    }

    static void mix1(int[] arr,int s,int m,int e){
        int[] ans = new int[e-s];
        int i=s;
        int j=m;
        int k=0;
        while (i<m && j<e) {
            if (arr[i]<arr[j]) {
               ans[k]=arr[i]; 
               i++;
            }
            else {
                ans[k]=arr[j];
                j++;
            }
            k++;
        }

        while (i<m) {
            ans[k]=arr[i]; 
               i++;
               k++;
        }
        while (j<e) {
            ans[k]=arr[j]; 
               j++;
               k++;
        }

        for (int l = 0; l < ans.length; l++) {
            arr[s+l]=ans[l];
        }
       
    }
}
